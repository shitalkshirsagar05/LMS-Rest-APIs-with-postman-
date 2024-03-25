//package com.infostack.lms.controllers;
//
//import com.infostack.lms.models.Book;
//import com.infostack.lms.services.BookService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/")
//public class MainController {
//    @Autowired
//    BookService bs;
//
//    @RequestMapping("books/insert")
//    public String insert() {
//
//        return "insert-book";
//    }
//
//    @PostMapping("books/save")
//    public String saveBook(@RequestParam("title") String title,
//                           @RequestParam("author") String author,
//                           @RequestParam("price") int price) {
//        Book b = new Book(title, author, price);
//        bs.saveBook(b);
//        return "redirect:/books";
//    }
//
//    @RequestMapping("/books/edit/{id}")
//    public String edit() {
//        return "edit-book";
//    }
//
//    @PostMapping("/books/edit/{id}")
//    public String update(@RequestParam("id") int id,
//                         @RequestParam("title") String title,
//                         @RequestParam("author") String author,
//                         @RequestParam("price") int price) {
//        Book b = new Book(id, title, author, price);
//        bs.saveBook(b);
//        return "redirect:/books";
//    }
//
//
//
//
//    @RequestMapping("/books/delete/{id}")
//    public String delete(@PathVariable("id") int id) {
//        bs.deleteBook(id);
//
//        return "redirect:/books";
//    }
//
//    @RequestMapping("books/{id}")
//    public String view(@PathVariable("id") int id, ModelMap mp) {
//        Book b = bs.getBook(id);
//        mp.addAttribute("book", b);
//        return "view-book";
//    }
//
//    @RequestMapping("books")
//    public String list(ModelMap mp) {
//        List<Book> bookList = bs.getAllBooks();
//        mp.addAttribute("booklist", bookList);
//        return "list-book";
//    }
//}

package com.infostack.lms.controllers;

import com.infostack.lms.models.Book;
import com.infostack.lms.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    BookService bs;

    // Request mapping for the insert book page
    @GetMapping("books/insert")
    public String insert() {
        return "insert-book"; // Returns the name of the view file insert-book.html
    }

    // Post mapping to save a new book
    @PostMapping("books/save")
    public String saveBook(@RequestParam("title") String title,
                           @RequestParam("author") String author,
                           @RequestParam("price") int price) {
        Book b = new Book(title, author, price);
        bs.saveBook(b);
        return "redirect:/books";
    }

    // Request mapping for the edit book page
    @GetMapping("/books/edit/{id}")
    public String edit(@PathVariable("id") int id, ModelMap mp) {
        Book b = bs.getBook(id);
        mp.addAttribute("book", b);
        return "edit-book"; // Returns the name of the view file edit-book.html
    }

    // Post mapping to update an existing book
    @PostMapping("/books/update")
    public String update(@RequestParam("id") int id,
                         @RequestParam("title") String title,
                         @RequestParam("author") String author,
                         @RequestParam("price") int price) {
        Book b = new Book(id, title, author, price);
        bs.saveBook(b);
        return "redirect:/books";
    }

    // Request mapping to delete a book
    @GetMapping("/books/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        bs.deleteBook(id);
        return "redirect:/books";
    }

    // Request mapping to view a specific book
    @GetMapping("books/{id}")
    public String view(@PathVariable("id") int id, ModelMap mp) {
        Book b = bs.getBook(id);
        mp.addAttribute("book", b);
        return "view-book"; // Returns the name of the view file view-book.html
    }

    // Request mapping to list all books
    @GetMapping("books")
    public String list(ModelMap mp) {
        List<Book> bookList = bs.getAllBooks();
        mp.addAttribute("booklist", bookList);
        return "list-book"; // Returns the name of the view file list-book.html
    }
}

