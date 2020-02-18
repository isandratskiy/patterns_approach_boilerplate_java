package factory;

import model.UserModel;

public class DefaultUser extends CustomerSupplier {
    @Override
    protected UserModel createUser() {
        return new UserModel().toBuilder()
                .strategy("Default")
                .build();
    }
}