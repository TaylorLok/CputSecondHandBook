package com.cput.ac.org.repository;

import com.cput.ac.org.domain.BookByCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookByCourseRepository extends JpaRepository<BookByCourse,String>
{
}
