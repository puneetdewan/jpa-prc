package com.hibernate.demo2;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hibernate.demo2.entity.Book;
import com.hibernate.demo2.service.IBookService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceUnitTest {
 
    @Autowired
    private IBookService bookService;
 
    @SuppressWarnings("deprecation")
	@Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<Book> books = bookService.list();
 
        Assert.assertEquals(books.size(), 3);
    }
}
