package com.cput.org.Controller.Factory;

import com.cput.org.Controller.Domain.Book;

import java.util.Map;

public interface IBookFactory
{
    Book getBook(Map<String, String> input);
}
