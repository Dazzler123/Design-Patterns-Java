package Facade_Pattern;

public class Customer implements CRUDFacade{
    @Override
    public void save() {
        System.out.println("Customer Saved.");
    }

    @Override
    public void update() {
        System.out.println("Customer details updated.");
    }

    @Override
    public void delete() {
        System.out.println("Customer deleted.");
    }

    @Override
    public void getAll() {
        System.out.println("All Customer details loaded.");
    }
}
