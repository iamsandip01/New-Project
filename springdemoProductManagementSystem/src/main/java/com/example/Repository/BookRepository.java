package com.example.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	public Book findBookByname(String name);
	public Book findBookByprice(int price);
}