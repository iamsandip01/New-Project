package com.example.Service.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Book;
import com.example.Repository.BookRepository;
import com.example.Service.BookService;



@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book addBook(Book book) {
		return bookRepository.save(book);
		
	}

	@Override
	public Book getBookById(int id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public List<Book> getAllBook() {
		return bookRepository.findAll();
	}

	@Override
	public Book findBookByName(String name) {
		return bookRepository.findBookByname(name);
	}

	@Override
	public Book findBookByPrice(int price) {
		return bookRepository.findBookByprice(price);
	}

	@Override
	public Book updateBookById(int id, Book book) {
		book.setId(id);
		return bookRepository.save(book);
	}

	@Override
	public void deleteBookById(int id) {
		bookRepository.deleteById(id);
	}


}