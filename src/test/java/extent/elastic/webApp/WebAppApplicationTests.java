package extent.elastic.webApp;

import extent.elastic.webApp.model.Book;
import extent.elastic.webApp.repositories.BookRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebAppApplicationTests {

    @Autowired
    private BookRepository bookRepository;

	@Test
	public void contextLoads() {
//
//        public Book(String title, String isbn, String publisher){
//            //this.id = id;
//            this.title = title;
//            this.isbn = isbn;
//            this.publisher = publisher;
//        }


        Book book = new Book("adi", "12345", "adithya");

        bookRepository.save(book);

        long num = bookRepository.count();

        Assert.assertEquals(1, num);

	}

}
