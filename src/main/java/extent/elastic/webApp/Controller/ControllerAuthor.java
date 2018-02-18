package extent.elastic.webApp.Controller;


import extent.elastic.webApp.repositories.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/demo")
public class ControllerAuthor {

    @Autowired
    private AuthorRepository authorRepository;




    //gets all the users from the database
    @GetMapping(path = "/all")
    public String getAuthors(Model model){

        model.addAttribute("authors", authorRepository.findAll());

        return "authors";


    }


}
