package extent.elastic.webApp.bootstrap;

import extent.elastic.webApp.model.Author;
import extent.elastic.webApp.model.Book;
import extent.elastic.webApp.repositories.AuthorRepository;
import extent.elastic.webApp.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        init();
    }

    private void init(){


        //Author Gayle Laakmann

        Author Gayle = new Author("Gayle", "Laakmann");
        Book book1 = new Book("cci", "1254", "Adithya");
        Gayle.getBooks().add(book1);
        book1.getAuthors().add(Gayle);

        authorRepository.save(Gayle);
        //bookRepository.save(book1);

    }


}
