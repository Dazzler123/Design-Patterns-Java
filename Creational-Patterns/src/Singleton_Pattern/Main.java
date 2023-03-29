package Singleton_Pattern;

public class Main {

    //====== Singleton Pattern ======

     /* Pattern involves a single class which is responsible to create an object
      while sure that only single object gets created.
      (Eg: DBConnection class)
      */

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}
