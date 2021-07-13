package com.thebongcoder.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thebongcoder.entity.Book;
import com.thebongcoder.entity.Story;
import com.thebongcoder.service.BookService;


@RestController
@RequestMapping(value = "/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/savebook", method = RequestMethod.POST)
	@ResponseBody
	public List<Book> saveBook(@RequestBody List<Book> bookList) {

		Story story = new Story();
		story.setStoryName("my story");
		for (Book book : bookList) {
			book.setStory(story);
		}

		List<Book> bookResponse = bookService.saveBook(bookList);
		return bookResponse;
	}

	@RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
	@ResponseBody
	public Book getBookDetails(@PathVariable int bookId) {
		Book bookResponse = bookService.findByBookId(bookId);

		return bookResponse;
	}

}