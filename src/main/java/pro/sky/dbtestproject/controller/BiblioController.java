package pro.sky.dbtestproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.dbtestproject.model.Book;
import pro.sky.dbtestproject.service.BiblioService;

import java.util.Set;

@RestController
@RequestMapping("/biblio")
public class BiblioController {

    private final BiblioService biblioService;

    public BiblioController (BiblioService biblioService) {
        this.biblioService = biblioService;
    }

    @GetMapping("/get-all-books-by-author")
    public ResponseEntity<Set<Book>> getAllBooksByAuthor (@RequestParam("id") int id) {
        return ResponseEntity.ok(biblioService.getAllBooksByAuthor(id));
    }
}
