package ec.utb.WebLibraryProject.data;

import ec.utb.WebLibraryProject.entity.Book;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

//Author: Benjamin Boson
public interface BookRepository extends CrudRepository<Book, Integer> {
    List<Book> findAll();
    List<Book> findByTitleContainsIgnoreCase(String title);
}
