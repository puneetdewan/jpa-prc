package com.hibernate.demo2.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.demo2.entity.Book;
import com.hibernate.demo2.service.IBookService;

@RestController
public class BookController {
	
	final static Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	private IBookService bookService;
	
	@GetMapping(path="/getBooks")
	public List<Book> getBooks(){
		
		List<Book> books = bookService.list();
		logger.debug(books.toString());
		
		return books;
	}
}
