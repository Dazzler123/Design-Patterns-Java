package Facade_Pattern;

public interface Item extends CRUDFacade{
    public void findByQtyOnHand(double qty);
}
