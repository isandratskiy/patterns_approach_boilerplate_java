package factory;

public class CustomerFactory {
    public static CustomerSupplier getCustomer(CustomerType type) {
        CustomerSupplier manager;

        switch (type) {
            case REST:
                manager = new RestUser();
                break;
            case WEB:
                manager = new WebUser();
                break;
            default:
                manager = new DefaultUser();
                break;
        }
        return manager;
    }
}
