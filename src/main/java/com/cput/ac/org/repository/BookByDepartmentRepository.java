package com.cput.org.Controller.repository;

import com.cput.org.Controller.Domain.BookByDepartment;

import java.util.Set;

public interface BookByDepartmentRepository extends IRepository<BookByDepartment,String>
{
    Set<BookByDepartment> getAll();


}
