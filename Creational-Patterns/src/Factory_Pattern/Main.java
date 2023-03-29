package Factory_Pattern;

public class Main {

    //======== Factory Pattern =======

    /* Create object without exposing the creation logic to the client and
     refer to newly created object using a common interface. */

    public static void main(String[] args) {
        //giving the object keyword we want as an argument of getInstance method in factory and assigning
        //it to the OS interface reference

        OS windows = OSFactory.getInstance("Windows");
        windows.spec();

        OS android = OSFactory.getInstance("Android");
        android.spec();

        OS ios = OSFactory.getInstance("IOS");
        ios.spec();

        //in this way the object creation using new keyword is hidden (no new Windows() or new Android() is given)
        //if we want to add a new OS type in the future, we will have to only update the factory.
    }
}
