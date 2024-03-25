package com.infostack.lms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/book")
public class UIController {
    @RequestMapping("")
    public String getAllBooks() {
        return "all-books";
    }

    @RequestMapping("/add")
    public String addBook() {
        return "add-book";
    }
}
