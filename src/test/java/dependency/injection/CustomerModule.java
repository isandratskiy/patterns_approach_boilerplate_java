package dependency.injection;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import factory.CustomerSupplier;
import factory.RestUser;
import model.UserModel;

import static com.google.inject.Scopes.*;

public class CustomerModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(CustomerSupplier.class).to(RestUser.class).in(SINGLETON);
    }

    @Provides
    public UserModel get(CustomerSupplier manager) {
        return manager.getUser();
    }
}
