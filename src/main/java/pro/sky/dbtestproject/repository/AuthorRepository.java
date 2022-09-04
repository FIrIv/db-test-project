package pro.sky.dbtestproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.dbtestproject.model.Author;
import pro.sky.dbtestproject.model.Book;

import java.util.Set;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author findAuthorById (int id);
}
