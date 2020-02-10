package dependency.injection;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import factory.CustomerManager;
import factory.RestUserManager;
import model.UserModel;

import static com.google.inject.Scopes.*;

public class CustomerModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(CustomerManager.class).to(RestUserManager.class).in(SINGLETON);
    }

    @Provides
    public UserModel get(CustomerManager manager) {
        return manager.getUser();
    }
}
