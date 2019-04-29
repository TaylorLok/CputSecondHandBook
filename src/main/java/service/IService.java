package service;

public interface IService<TYPE,ID>
{
    TYPE create(TYPE type);
    TYPE update(TYPE type);
    void delete(ID id);
    TYPE read(ID id);

}//its interface because it can have several implementation of this service or repository
