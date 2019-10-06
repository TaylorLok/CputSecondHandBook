package com.cput.ac.org.repository;

import com.cput.ac.org.domain.BookByDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookByDepartmentRepository extends JpaRepository<BookByDepartment,String>
{
}
