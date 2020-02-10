package factory;

public class CustomerFactory {
    public static CustomerManager getCustomer(CustomerType type) {
        CustomerManager manager;

        switch (type) {
            case REST:
                manager = new RestUserManager();
                break;
            case WEB:
                manager = new WebUserManager();
                break;
            default:
                manager = new DefaultUserManager();
                break;
        }
        return manager;
    }
}
