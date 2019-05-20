package service;

import Domain.BookByDepartment;

import java.util.Set;

public interface BookByDepartmentService extends IService<BookByDepartment,String>
{
    Set<BookByDepartment> getAll();
}
