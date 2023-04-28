package com.example.Service;

import java.util.List;

import com.example.Entity.Book;



public interface BookService {
	public Book addBook(Book book);
	public Book getBookById(int id);
	public Book updateBookById(int id, Book book);
	public void deleteBookById(int id);	
	public Book findBookByName(String name);
	public Book findBookByPrice(int price);
	public List<Book> getAllBook();
}