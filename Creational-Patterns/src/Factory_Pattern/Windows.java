package Factory_Pattern;

public class Windows implements OS{
    @Override
    public void spec() {
        System.out.println("Operating system in Microsoft computers");
    }
}
