package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Book;

@Service
public interface BookService {
	public Book addBook(Book book);
	public List<Book> getAllBook();
}
