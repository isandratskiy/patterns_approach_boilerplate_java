package factory;

import model.UserModel;
import strategy.WebCreationUser;

public class WebUserManager extends CustomerManager {
    @Override
    protected UserModel createUser() {
        user = new WebCreationUser().createUser("Web", "Webovich");
        return user;
    }
}