package pro.sky.dbtestproject.service;

import org.springframework.stereotype.Service;
import pro.sky.dbtestproject.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService (BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
