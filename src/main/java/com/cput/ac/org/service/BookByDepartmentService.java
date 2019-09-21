package com.cput.ac.org.service;

import com.cput.ac.org.domain.BookByDepartment;

import java.util.Set;

public interface BookByDepartmentService extends IService<BookByDepartment,String>
{
    Set<BookByDepartment> getAll();
}
