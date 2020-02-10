package factory;

import lombok.val;
import model.UserModel;
import org.junit.jupiter.api.*;

import static factory.CustomerFactory.*;
import static factory.CustomerType.*;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerFactoryTest {
    private CustomerManager customerManager;
    private UserModel customer;

    @Nested
    class WhenCustomerTypeIsRest {
        @BeforeEach
        void arrange() {
            customerManager = getCustomer(REST);
            customer = customerManager.getUser();
        }

        @Test
        void shouldCreatedWithRestType() {
            assertEquals("RestStrategy", customer.getStrategy());
        }

        @Test
        void shouldBeEqualWithSameObject() {
            val sameCustomer = customerManager.getUser();
            assertEquals(customer, sameCustomer);
        }

        @Test
        void shouldBeNotEqualAfterReset() {
            customerManager.resetUser();
            val newCustomer = customerManager.getUser();
            assertNotEquals(customer, newCustomer);
        }
    }

    @Nested
    class WhenCustomerTypeIsWeb {
        @BeforeEach
        void arrange() {
            customerManager = getCustomer(WEB);
            customer = customerManager.getUser();
        }

        @Test
        void shouldCreatedWithWebType() {
            assertEquals("WebStrategy", customer.getStrategy());
        }
    }

    @Nested
    class WhenCustomerTypeIsDefault {
        @BeforeEach
        void arrange() {
            customerManager = getCustomer(DEFAULT);
            customer = customerManager.getUser();
        }

        @Test
        void shouldCreatedWithDefaultType() {
            assertEquals("Default", customer.getStrategy());
        }
    }
}
