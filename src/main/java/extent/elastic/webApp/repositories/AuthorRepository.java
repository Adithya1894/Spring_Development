package extent.elastic.webApp.repositories;

import extent.elastic.webApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>{
}
