package repository;

import Domain.BookByDepartment;

import java.util.Set;

public interface BookByDepartmentRepository extends IRepository<BookByDepartment,String>
{
    Set<BookByDepartment> getAll();


}
