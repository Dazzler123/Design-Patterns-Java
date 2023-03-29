package Factory_Pattern;

public class OSFactory {
    public static OS getInstance(String os) {
        switch (os) {
            //if the asked os type is windows, then return a new object of windows
            case "Windows" :
                return new Windows();
            case "Android" :
                return new Android();
            case "IOS" :
                return new IOS();
        }
        return null;
    }
}
