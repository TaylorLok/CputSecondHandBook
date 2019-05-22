package com.cput.ac.org.Factory;

import com.cput.ac.org.Domain.Book;

import java.util.Map;

public interface IBookFactory
{
    Book getBook(Map<String, String> input);
}
