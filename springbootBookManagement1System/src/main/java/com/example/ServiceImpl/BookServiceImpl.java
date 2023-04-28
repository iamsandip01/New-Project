package com.example.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Entity.Book;
import com.example.Service.BookService;
import com.example.repo.BookRepo;

public class BookServiceImpl implements BookService{
	@Autowired
	BookRepo bookRepo;
	
	@Override
	public Book addBook(Book book) {
		
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

}
