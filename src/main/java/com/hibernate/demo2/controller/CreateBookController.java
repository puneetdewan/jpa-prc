package com.hibernate.demo2.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.demo2.entity.Book;
import com.hibernate.demo2.service.IBookService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CreateBookController {

	private static Logger logger  = LoggerFactory.getLogger(CreateBookController.class);

	@Autowired
	IBookService bookService;


	@PostMapping(path="/addBook")
	public Boolean addBook(@Valid @RequestBody Book book) {

		Boolean bool =  bookService.saveBook(book);
		
		return bool;
	}

}
