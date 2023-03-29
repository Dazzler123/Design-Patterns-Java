package Facade_Pattern;

public interface CRUDFacade {
    public void save(String name);

    public void update(String name);

    public void delete(String id);

    public void getAll();
}
