package strategy;

import model.UserModel;

public interface CreatableUser {
    UserModel createUser(String firstName, String lastName);
}
