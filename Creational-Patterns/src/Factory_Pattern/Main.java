package Factory_Pattern;

public class Main {
    public static void main(String[] args) {
        OS windows = OSFactory.getInstance("Windows");
        windows.spec();

        OS android = OSFactory.getInstance("Android");
        android.spec();

        OS ios = OSFactory.getInstance("IOS");
        ios.spec();
    }
}
