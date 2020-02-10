package singleton;

import model.UserModel;

class UserModelSingleton {
    static UserModel ourInstance;

    private UserModelSingleton() {
    }

    static UserModel getInstance() {
        if(ourInstance == null)
            ourInstance = new UserModel().toBuilder().build();
        return ourInstance;
    }
}
