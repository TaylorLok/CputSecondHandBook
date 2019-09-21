package com.cput.ac.org.repository;

import com.cput.ac.org.domain.BookByDepartment;

import java.util.Set;

public interface BookByDepartmentRepository extends IRepository<BookByDepartment,String>
{
    Set<BookByDepartment> getAll();


}
