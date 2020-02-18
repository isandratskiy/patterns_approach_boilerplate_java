package factory;

import com.google.common.flogger.FluentLogger;
import model.UserModel;

import static com.google.common.flogger.FluentLogger.*;

public abstract class CustomerSupplier {
    protected static final FluentLogger logger = forEnclosingClass();

    protected UserModel user;

    protected abstract UserModel createUser();

    public void resetUser() {
        if (null != user) {
            user = null;
            logger.atInfo().log("User is deleted");
        }
    }

    public UserModel getUser() {
        return null == user ? createUser() : user;
    }
}
