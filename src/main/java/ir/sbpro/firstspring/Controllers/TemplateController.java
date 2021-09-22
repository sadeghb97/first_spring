package ir.sbpro.firstspring.Controllers;
import ir.sbpro.firstspring.Models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class TemplateController {
    @RequestMapping("/first_view")
    public String getFirstView(){
        return "index";
    }

    @RequestMapping("/somedir")
    public String getMeView(){
        return "somedir/hello";
    }

    @GetMapping(value = "/viewparams")
    public String viewParams(Model model){
        model.addAttribute("name", "Sadegh Khan");
        Person person = new Person("Hamid", "Masumi");
        Person person1 = new Person("Mahmud", "B");
        Person person2 = new Person("Masud", "Rezaei");
        ArrayList<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person1);
        people.add(person2);
        model.addAttribute("from", people);
        return "params/params";
    }

    @GetMapping(value = "/personform")
    public String personForm(){
        return "form/myform";
    }

    @GetMapping(value = "/secpersonform")
    public String objectPersonForm(Model model){
        model.addAttribute("persondata", new Person());
        return "form/secform";
    }
}
