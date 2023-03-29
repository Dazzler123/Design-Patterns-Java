package Facade_Pattern.impl;

import Facade_Pattern.CRUDFacade;

public class CustomerImpl implements CRUDFacade {
    @Override
    public void save(String name) {
        System.out.println("Customer " + name + " Saved.");
    }

    @Override
    public void update(String name) {
        System.out.println("Customer " + name + " updated.");
    }

    @Override
    public void delete(String id) {
        System.out.println("Customer " + id + " deleted.");
    }

    @Override
    public void getAll() {
        System.out.println("All Customers loaded.");
    }
}
