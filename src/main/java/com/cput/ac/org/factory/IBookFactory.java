package com.cput.ac.org.factory;

import com.cput.ac.org.domain.Book;

import java.util.Map;

public interface IBookFactory
{
    Book getBook(Map<String, String> input);
}
