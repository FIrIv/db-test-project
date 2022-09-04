package pro.sky.dbtestproject.service;

import pro.sky.dbtestproject.repository.AuthorRepository;

public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService (AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
}
