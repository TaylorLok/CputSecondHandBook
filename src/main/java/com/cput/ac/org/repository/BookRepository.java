package com.cput.ac.org.repository;

import com.cput.ac.org.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,String>
{
}
