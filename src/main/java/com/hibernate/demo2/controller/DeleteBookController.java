package com.hibernate.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.demo2.service.IBookService;

@RestController
public class DeleteBookController {
	
	@Autowired
	IBookService bookService;
	
	@DeleteMapping(path="/deleteBook")
	public Boolean deleteBook(long id) {
		
		boolean bool =  bookService.deleteBook(id);
		return bool;
		
	}

}
