package factory;

import model.UserModel;

public class DefaultUserManager extends CustomerManager {
    @Override
    protected UserModel createUser() {
        return new UserModel().toBuilder()
                .strategy("Default")
                .build();
    }
}