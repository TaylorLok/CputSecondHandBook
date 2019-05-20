package com.cput.org.Controller.service;

import com.cput.org.Controller.Domain.BookByDepartment;

import java.util.Set;

public interface BookByDepartmentService extends IService<BookByDepartment,String>
{
    Set<BookByDepartment> getAll();
}
