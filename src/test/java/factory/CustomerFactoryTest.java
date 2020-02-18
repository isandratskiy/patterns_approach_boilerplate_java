package factory;

import lombok.val;
import model.UserModel;
import org.junit.jupiter.api.*;

import static factory.CustomerFactory.*;
import static factory.CustomerTypeEnum.*;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerFactoryTest {
    private CustomerSupplier customerSupplier;
    private UserModel customer;

    @Nested
    class WhenCustomerTypeIsRest {
        @BeforeEach
        void arrange() {
            customerSupplier = getCustomer(REST);
            customer = customerSupplier.getUser();
        }

        @Test
        void shouldCreatedWithRestType() {
            assertEquals("RestStrategy", customer.getStrategy());
        }

        @Test
        void shouldBeEqualWithSameObject() {
            val sameCustomer = customerSupplier.getUser();
            assertEquals(customer, sameCustomer);
        }

        @Test
        void shouldBeNotEqualAfterReset() {
            customerSupplier.resetUser();
            val newCustomer = customerSupplier.getUser();
            assertNotEquals(customer, newCustomer);
        }
    }

    @Nested
    class WhenCustomerTypeIsWeb {
        @BeforeEach
        void arrange() {
            customerSupplier = getCustomer(WEB);
            customer = customerSupplier.getUser();
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
            customerSupplier = getCustomer(DEFAULT);
            customer = customerSupplier.getUser();
        }

        @Test
        void shouldCreatedWithDefaultType() {
            assertEquals("Default", customer.getStrategy());
        }
    }
}
