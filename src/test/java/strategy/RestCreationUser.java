package strategy;

import com.google.common.flogger.FluentLogger;
import lombok.val;
import model.UserModel;

public class RestCreationUser implements CreatableUser {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Override
    public UserModel createUser(String firstName, String lastName) {
        val userModel = new UserModel().toBuilder()
                .firstName(firstName)
                .lastName(lastName)
                .strategy("RestStrategy")
                .build();
        logger.atInfo().log("User for rest : " + userModel.toString());
        return userModel;
    }
}
