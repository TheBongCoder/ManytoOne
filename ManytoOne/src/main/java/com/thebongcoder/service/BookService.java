package com.thebongcoder.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.thebongcoder.entity.Book;


@Component
public interface BookService {
	public List<Book> saveBook(List<Book> book);
	public Book findByBookId(int bookId);
}