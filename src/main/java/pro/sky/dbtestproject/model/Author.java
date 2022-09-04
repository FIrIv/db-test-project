package pro.sky.dbtestproject.model;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @JsonIgnore
    @OneToMany (mappedBy = "author")
    private Set<Book> books;

    public Author () {
    }

    public Author (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    @Override
    public String toString() {
        return "Автор: " + this.name + ". ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
