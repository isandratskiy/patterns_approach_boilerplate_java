package dependency_injection;

import com.google.inject.Inject;
import model.UserModel;
import name.falgout.jeffrey.testing.junit.guice.GuiceExtension;
import name.falgout.jeffrey.testing.junit.guice.IncludeModule;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(GuiceExtension.class)
public class CustomerDITest {
    @Nested
    @IncludeModule(CustomerModule.class)
    class whenAnnotatedOverClass {
        @Inject
        private UserModel customer;

        @Test
        void shouldBeInjectedAsClassField() {
            assertEquals("RestStrategy", customer.getStrategy());
        }
    }

    @Nested
    class whenAnnotatedOverMethod {
        @Test
        @IncludeModule(CustomerModule.class)
        void shouldBeInjectedAsTestArgument(UserModel customer) {
            assertEquals("RestStrategy", customer.getStrategy());
        }
    }
}
