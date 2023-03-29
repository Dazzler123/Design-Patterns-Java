package Facade_Pattern;

import Facade_Pattern.impl.CustomerImpl;
import Facade_Pattern.impl.ItemImpl;

public class Main {

    //======== Facade Design Pattern =========
    /*
        Hides the complexity of the system by providing
        a common interface to the client.
        (Eg: CrudDAO layer)

        * If there is common repetitive methods in modules, put them into an interface and make it
         the parent of the relevant modules.

        * Here in this example, both Customer and Item have similar methods with common logics (CRUD operations).
          So we removed those methods and put them on an interface and make it as the parent for both Customer
          & Item.
     */

    public static void main(String[] args) {
        Customer customer = new CustomerImpl();
        customer.save("Dazzler");
        customer.update("Dazzler");
        customer.delete("D001");
        customer.findByAddress("Gampaha");

        System.out.println("========================================");

        Item item = new ItemImpl();
        item.save("Biscuits");
        item.update("Biscuits");
        item.delete("ITM-001");
        item.findByQtyOnHand(40);
    }
}
