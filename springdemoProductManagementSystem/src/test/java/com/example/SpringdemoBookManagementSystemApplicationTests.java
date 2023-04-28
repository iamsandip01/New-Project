package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.Service.BookService;
import com.example.Entity.Book;
import com.example.Repository.BookRepository;

@SpringBootTest
class BookMangaementApplicationTests {

	@Autowired
	BookService bs;
	@MockBean
	BookRepository brepo;
	
	@Test
	void testAddBook() {
		Book b1 = new Book(1,"book1","book1author",100);
		Mockito.when(brepo.save(b1)).thenReturn(b1);
		assertEquals(b1, bs.addBook(b1));
	}
	
	@Test
	void getAll() {
		List<Book> book = Stream.of(new Book(2,"book2","book2author",200), new Book(3,"food","book3author",300))
				.collect(Collectors.toList());
		Mockito.when(brepo.findAll()).thenReturn(book);
		assertEquals(2,bs.getAllBook().size());
	}

}
