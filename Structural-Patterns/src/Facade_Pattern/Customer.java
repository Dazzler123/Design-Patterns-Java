package Facade_Pattern;

public interface Customer extends CRUDFacade{
    public void findByAddress(String address);
}
