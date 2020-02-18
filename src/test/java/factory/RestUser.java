package factory;

import model.UserModel;

public class RestUser extends CustomerSupplier {
    @Override
    protected UserModel createUser() {
        user = new UserModel().toBuilder()
                .firstName("Rest")
                .lastName("Restovich")
                .strategy("RestStrategy")
                .build();
        logger.atInfo().log("Rest user as : " + user.toString());
        return user;
    }
}
