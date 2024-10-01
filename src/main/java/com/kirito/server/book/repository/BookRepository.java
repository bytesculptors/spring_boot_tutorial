package com.kirito.server.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kirito.server.book.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
