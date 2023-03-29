package Facade_Pattern;

public class Item implements CRUDFacade{
    @Override
    public void save() {
        System.out.println("Item Saved.");
    }

    @Override
    public void update() {
        System.out.println("Item details updated.");
    }

    @Override
    public void delete() {
        System.out.println("Item deleted.");
    }

    @Override
    public void getAll() {
        System.out.println("All Items loaded.");
    }
}
