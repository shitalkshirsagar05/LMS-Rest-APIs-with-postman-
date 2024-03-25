package com.infostack.lms.services;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.infostack.lms.models.Book;
import com.infostack.lms.repos.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository br;
    public Book saveBook(Book b) {
        return br.save(b);
    }

    public List<Book> getAllBooks() {
        return (List<Book>) br.findAll();
    }

    public Book getBook(int id) {
        return br.findById(id).get();
    }

    public void deleteBook(int id) {
        br.deleteById(id);
    }
    public void updateBook(Book b) {
        // Checkin' if the book with the same id exists in the database
        if (br.existsById(b.getId())) {
            // Updating the existing book
            br.save(b);
        } else {
            // Handling the case where the book does not exist
            throw new RuntimeException("Book not found with id: " + b.getId());

        }
    }
}
