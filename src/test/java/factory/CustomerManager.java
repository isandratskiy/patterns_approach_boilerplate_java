package factory;

import model.UserModel;

public abstract class CustomerManager {
    protected UserModel user;
    protected abstract UserModel createUser();

    public void resetUser() {
        if (null != user) user = null;
    }

    public UserModel getUser() {
        return null == user ? createUser() : user;
    }
}
