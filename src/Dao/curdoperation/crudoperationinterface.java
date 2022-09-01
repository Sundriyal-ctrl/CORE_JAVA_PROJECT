package Dao.curdoperation;

public interface crudoperationinterface {
    void create();
    void insert();
    void delete(int id);
    void update();
    void fetchOne(int id);
    void fetchAll();
}
