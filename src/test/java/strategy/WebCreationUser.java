package strategy;

import com.google.common.flogger.FluentLogger;
import lombok.val;
import model.UserModel;

import static com.google.common.flogger.FluentLogger.forEnclosingClass;

public class WebCreationUser implements CreatableUser {
    private static final FluentLogger logger = forEnclosingClass();

    @Override
    public UserModel createUser(String firstName, String lastName) {
        val userModel = new UserModel().toBuilder()
                .firstName(firstName)
                .lastName(lastName)
                .strategy("WebStrategy")
                .build();
        logger.atInfo().log("User for rest : " + userModel.toString());
        return userModel;
    }
}
