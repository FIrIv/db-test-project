package pro.sky.dbtestproject.model;
import javax.persistence.*;
import java.util.Objects;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn (name = "author_id")
    private Author author;

    public Book () {
    }

    public Book (String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public String getName () {
        return this.name;
    }

    @Override
    public String toString() {
        return "Книга: " + this.name + ". "+ author.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
