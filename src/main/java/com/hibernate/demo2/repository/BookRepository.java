package com.hibernate.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.demo2.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
