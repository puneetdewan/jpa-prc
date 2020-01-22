package com.hibernate.demo2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.demo2.entity.Book;
import com.hibernate.demo2.repository.BookRepository;
import com.hibernate.demo2.service.IBookService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BookServiceImpl implements IBookService{

	@Autowired
	BookRepository bookRepo;
	
	@Override
	public boolean saveBook(Book book) {
		
		try {
			bookRepo.save(book);
		}catch (Exception e) {
			String error = e.getStackTrace().toString();
			System.err.print(error);
			return false;
		}
		return true;
	}

	@Override
	public List<Book> list() {
		
		List<Book> books = null;
		try {
			books = bookRepo.findAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        return books;
	}

	@Override
	public boolean deleteBook(long id) {
		try {
			bookRepo.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
