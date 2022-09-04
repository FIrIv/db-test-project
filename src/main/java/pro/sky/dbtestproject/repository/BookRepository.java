package pro.sky.dbtestproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.dbtestproject.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
