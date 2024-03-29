package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
