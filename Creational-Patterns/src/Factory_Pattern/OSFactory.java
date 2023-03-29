package Factory_Pattern;

public class OSFactory {
    public static OS getInstance(String os) {
//        if (os.equals("Windows")) {
//            return new Windows();
//        } else if (os.equals("Android")) {
//            return new Android();
//        } else if (os.equals("IOS")) {
//            return new IOS();
//        } else {
//            return new Object();
//        }

        switch (os) {
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
