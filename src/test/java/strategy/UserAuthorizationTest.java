package strategy;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserAuthorizationTest {
    private CreatableUser user;

    @Nested
    class WhenUserAuthorizationOnRestApi {
        @BeforeEach
        void arrange() {
            user = new RestCreationUser();
        }

        @Test
        void canAuthorizeOnRestApi() {
            val createdUser = user.createUser("Rest", "Restovich");
            assertEquals(
                    createdUser.getStrategy(), "RestStrategy"
            );
        }
    }

    @Nested
    class WhenUserAuthorizationOnWebPage {
        @BeforeEach
        void arrange() {
            user = new WebCreationUser();
        }

        @Test
        void canAuthorizeOnWebPage() {
            val createdUser = user.createUser("Web", "Webovich");
            assertEquals(
                    createdUser.getStrategy(), "WebStrategy"
            );
        }
    }
}
