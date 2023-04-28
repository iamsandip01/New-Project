package com.example.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Book;
import com.example.Service.BookService;



@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	
	@PostMapping(path="/book")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	
	@GetMapping(path="/book")
	public List<Book> getAllBook(){
		return bookService.getAllBook();
	}
	@GetMapping(path="/book/{id}")
	public Book getBookById(@PathVariable int id){
		return bookService.getBookById(id);
	}
	@GetMapping(path="/book/{name}")
	public Book findBookByName(@PathVariable String name) {
		return bookService.findBookByName(name);
	}
	
	@GetMapping(path="/book/{price}")
	public Book findBookByPrice(@PathVariable int price) {
		return bookService.findBookByPrice(price);
	}
	@PutMapping(path="/book/{id}")
	public Book updateBookById(@PathVariable int id,@RequestBody Book book) {
		return bookService.updateBookById(id, book);
	}
	@DeleteMapping(path="/book/{id}")
	public void deleteBookById(@PathVariable int id) {
		 bookService.deleteBookById(id);
		 
	}
	
}
