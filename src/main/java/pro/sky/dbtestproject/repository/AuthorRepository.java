package pro.sky.dbtestproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.dbtestproject.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
