package Singleton_Pattern;

public class Singleton {
    //create a static instance
    private static Singleton instance = null;

    // make constructor private to prevent instantiation from outside the class
    private Singleton() {

    }

    // Method to get the singleton instance
    public static Singleton getInstance() {
        //if the instance in null return a new singleton object, if not return the existing instance
        if (instance == null) {

            //assign a new object to the static instance
            instance = new Singleton();

            //this statement will be printed if the instance is null which means
            //that it's the first time this class is executed
            System.out.println("First time executed.");
        }

        //this statement will be printed if the instance is not null which means
        //that it's not the first time this class is executed
        System.out.println("Not the first time executed.");

        return instance;
    }
}
