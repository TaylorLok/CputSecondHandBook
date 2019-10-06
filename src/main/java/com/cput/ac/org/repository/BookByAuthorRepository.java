package com.cput.ac.org.repository;

import com.cput.ac.org.domain.BookByAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookByAuthorRepository extends JpaRepository<BookByAuthor,String>
{

}
