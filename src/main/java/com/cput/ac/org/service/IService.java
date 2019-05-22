package com.cput.ac.org.service;

public interface IService<Real,sort>
{
    Real create(Real type);
    Real update(Real type);
    void delete(Real id);
    Real read(Real id);

}//its interface because it can have several implementation of this service or repository
