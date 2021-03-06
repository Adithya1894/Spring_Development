package extent.elastic.webApp.Controller;

import extent.elastic.webApp.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    //@Autowired
    private BookRepository bookRepository;

    //Autowired is removed, so using the manual constructor injection
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    //Returns the list of all the books available in the Database. shouldn't be doing this in production
    //Use pagination to retreive a small amount of data in one page, so it wont spoil the performance
    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }


}
