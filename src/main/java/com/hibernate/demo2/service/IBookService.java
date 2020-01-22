package com.hibernate.demo2.service;

import java.util.List;

import com.hibernate.demo2.entity.Book;

public interface IBookService {
	public boolean saveBook(Book book);
	public List<Book> list();
	public boolean deleteBook(long id);

}
