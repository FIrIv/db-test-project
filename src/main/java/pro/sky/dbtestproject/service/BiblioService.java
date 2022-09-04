package pro.sky.dbtestproject.service;

import pro.sky.dbtestproject.model.Book;
import pro.sky.dbtestproject.repository.AuthorRepository;
import pro.sky.dbtestproject.repository.BookRepository;

import java.util.Set;

public class BiblioService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BiblioService (AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Set<Book> getAllBooksByAuthor (int id) {
        return authorRepository.findAuthorById(id).getBooks();
    }
}
