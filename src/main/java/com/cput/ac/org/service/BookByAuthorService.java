package com.cput.ac.org.service;

import com.cput.ac.org.Domain.BookByAuthor;

import java.util.Set;

public interface BookByAuthorService extends IService<BookByAuthor,String>
{
    Set<BookByAuthor> getAll();
}
