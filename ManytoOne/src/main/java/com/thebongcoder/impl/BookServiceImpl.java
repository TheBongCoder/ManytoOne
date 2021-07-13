package com.thebongcoder.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thebongcoder.entity.Book;
import com.thebongcoder.repository.BookRepository;
import com.thebongcoder.service.BookService;



@Service("bookServiceImpl")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> saveBook(List<Book> bookList) {

		List<Book> response = (List<Book>) bookRepository.saveAll(bookList);
		return response;

	}

	public Book findByBookId(int bookId) {
		Book book = bookRepository.findByBookId(bookId);
		return book;
	}
}
