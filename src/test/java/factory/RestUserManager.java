package factory;

import model.UserModel;
import strategy.RestCreationUser;

public class RestUserManager extends CustomerManager {
    @Override
    protected UserModel createUser() {
        user = new RestCreationUser().createUser("Rest", "Restovich");
        return user;
    }
}
