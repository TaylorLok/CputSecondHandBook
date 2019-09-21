package com.cput.ac.org.repository;

import com.cput.ac.org.domain.BookByDepartment;

import java.util.*;

public class BookByDepartmentRepositoryImpl implements BookByDepartmentRepository
{
    private static BookByDepartmentRepository repository;
    private Map<String, BookByDepartment> department;

    private BookByDepartmentRepositoryImpl()
    {
        this.department = new HashMap<>();
    }

    public static BookByDepartmentRepository getRepository()
    {
        if(repository == null) repository = new BookByDepartmentRepositoryImpl();
        return repository;
    }


    @Override
    public BookByDepartment create(BookByDepartment dpt)
    {
        this.department.put(dpt.getDptOfAppliedScience(),dpt);
        this.department.put(dpt.getDptOfBusiness(),dpt);
        this.department.put(dpt.getDptOfEducation(),dpt);
        this.department.put(dpt.getDptOfEngineering(),dpt);
        this.department.put(dpt.getDptOfHealth(),dpt);
        this.department.put(dpt.getDptOfInformDesign(),dpt);
        return dpt;
    }

    @Override
    public BookByDepartment update(BookByDepartment dpt) {
        this.department.replace(dpt.getDptOfAppliedScience(),dpt);
        this.department.replace(dpt.getDptOfBusiness(),dpt);
        this.department.replace(dpt.getDptOfEducation(),dpt);
        this.department.replace(dpt.getDptOfEngineering(),dpt);
        this.department.replace(dpt.getDptOfHealth(),dpt);
        this.department.replace(dpt.getDptOfInformDesign(),dpt);
        return dpt;
    }

    @Override
    public void delete(BookByDepartment dpt)
    {
        this.department.remove(dpt);
    }

    @Override
    public BookByDepartment read(BookByDepartment dpt)
    {
        this.department.get(dpt);
        return dpt;
    }

    @Override
    public Set<BookByDepartment> getAll() {
        Collection<BookByDepartment> bookdepartment = this.department.values();
        Set<BookByDepartment> set = new HashSet<>();
        set.addAll(bookdepartment);
        return set;
    }
}
