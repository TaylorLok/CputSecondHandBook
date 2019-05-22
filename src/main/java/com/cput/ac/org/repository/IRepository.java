package com.cput.ac.org.repository;

public interface IRepository<Real,sort>
{
    Real create(Real sort);
    Real update(Real sort);
    void delete(Real sort);
    Real read(Real sort);
}
