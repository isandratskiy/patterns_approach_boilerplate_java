package factory;

import model.UserModel;

public class WebUser extends CustomerSupplier {
    @Override
    protected UserModel createUser() {
        user = new UserModel().toBuilder()
                .firstName("Web")
                .lastName("Webovich")
                .strategy("WebStrategy")
                .build();
        logger.atInfo().log("Web user as : " + user.toString());
        return user;
    }
}