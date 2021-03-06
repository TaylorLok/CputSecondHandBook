package com.cput.ac.org.service;

import com.cput.ac.org.domain.BookByDepartment;
import com.cput.ac.org.repository.BookByDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("BookByDepartmentServiceImpl")
public class BookByDepartmentServiceImpl implements BookByDepartmentService
{
    private static BookByDepartmentServiceImpl service = null;
    private Map<String, BookByDepartment> departmentMap;

    private BookByDepartmentServiceImpl()
    {
        this.departmentMap = new HashMap<>();
        this.service = service;
    }

    public static BookByDepartmentServiceImpl getRepository()
    {
        if(service == null) service = new BookByDepartmentServiceImpl();
        return service;

    }

    @Autowired
    BookByDepartmentRepository bookByDepartmentRepository;


    @Override
    public BookByDepartment create(BookByDepartment dpt)
    {
        this.departmentMap.put(dpt.getDptOfAppliedScience(),dpt);
        this.departmentMap.put(dpt.getDptOfBusiness(),dpt);
        this.departmentMap.put(dpt.getDptOfEducation(),dpt);
        this.departmentMap.put(dpt.getDptOfEngineering(),dpt);
        this.departmentMap.put(dpt.getDptOfHealth(),dpt);
        this.departmentMap.put(dpt.getDptOfInformDesign(),dpt);
        return dpt;
    }

    @Override
    public BookByDepartment update(BookByDepartment dpt) {
        this.departmentMap.replace(dpt.getDptOfAppliedScience(),dpt);
        this.departmentMap.replace(dpt.getDptOfBusiness(),dpt);
        this.departmentMap.replace(dpt.getDptOfEducation(),dpt);
        this.departmentMap.replace(dpt.getDptOfEngineering(),dpt);
        this.departmentMap.replace(dpt.getDptOfHealth(),dpt);
        this.departmentMap.replace(dpt.getDptOfInformDesign(),dpt);
        return dpt;
    }

    @Override
    public void delete(BookByDepartment dpt)
    {
        this.departmentMap.remove(dpt);
    }

    @Override
    public BookByDepartment read(BookByDepartment dpt)
    {
        this.departmentMap.get(dpt);
        return dpt;
    }

    @Override
    public Set<BookByDepartment> getAll()
    {
        Set<BookByDepartment> set = new HashSet<>();
        set.addAll(bookByDepartmentRepository.findAll());
        return set;
    }
}
