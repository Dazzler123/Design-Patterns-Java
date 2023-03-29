package Facade_Pattern.impl;

import Facade_Pattern.Item;

public class ItemImpl implements Item {
    @Override
    public void save(String name) {
        System.out.println("Item " + name + " Saved.");
    }

    @Override
    public void update(String name) {
        System.out.println("Item " + name + " updated.");
    }

    @Override
    public void delete(String id) {
        System.out.println("Item " + id + " deleted.");
    }

    @Override
    public void getAll() {
        System.out.println("All Items loaded.");
    }

    @Override
    public void findByQtyOnHand(double qty) {
        System.out.println(qty + " packets of Malibun Biscuit found.");
    }
}
