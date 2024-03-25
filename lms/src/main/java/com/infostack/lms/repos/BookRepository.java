package com.infostack.lms.repos;

import com.infostack.lms.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

    Book findByTitle(String title);

}

