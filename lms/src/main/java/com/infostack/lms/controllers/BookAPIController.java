package com.infostack.lms.controllers;

import com.infostack.lms.models.Book;
import com.infostack.lms.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // to make a restful controller
@RequestMapping("/book/api") // to map the url
public class BookAPIController {
    // to fetch all books
    @Autowired
    BookService bookService;//dependency injection
    // to fetch all books
    @RequestMapping("/fetch")//http://localhost:8000/book/api/fetch
    public List<Book> fetch() {
        return bookService.getAllBooks();
    }
    // to fetch a book with id
    @RequestMapping("/fetch/{id}")//http://localhost:8000/book/api/fetch/1
    public Book fetch(@PathVariable("id") int id) {
        return bookService.getBook(id);
    }
    // to insert a new book with title, author and price
    @RequestMapping("/save")//http://localhost:8000/book/api/save
    public Book save(@RequestParam("bookTitle") String title, @RequestParam("bookAuthor") String author, @RequestParam("bookPrice") int price) {
        Book book = new Book(title, author, price);
        return bookService.saveBook(book);
    }
    //to delete a book with id
    @RequestMapping("/delete/{id}")//http://localhost:8000/book/api/delete/1
    public boolean delete(@PathVariable("id") int id) {
        bookService.deleteBook(id);
        return true;
    }
//to update a book with id and new values
    @RequestMapping("/update")//http://localhost:8000/book/api/update
    public Book update(@RequestParam("bookId") int id,
                       @RequestParam("bookTitle") String title,
                       @RequestParam("bookAuthor") String author,
                       @RequestParam("bookPrice") int price) {
        Book book = new Book(id, title, author, price);//creating a new book object with new values
        return bookService.saveBook(book);//updating the book with new values

    }
    //to add a book with id
    @RequestMapping("/add")//http://localhost:8000/book/api/add
    public Book add(@RequestParam("bookTitle") String title,
                    @RequestParam("bookAuthor") String author,
                    @RequestParam("bookPrice") int price) {
        Book book = new Book(title, author, price);
        return bookService.saveBook(book);

        }
    }

