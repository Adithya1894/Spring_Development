package extent.elastic.webApp.repositories;

import extent.elastic.webApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
