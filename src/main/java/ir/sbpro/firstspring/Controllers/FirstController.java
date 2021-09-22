package ir.sbpro.firstspring.Controllers;
import com.google.gson.Gson;
import ir.sbpro.firstspring.Models.Person;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;

@RestController
public class FirstController {
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String mainProject(){
        return "Welcome To Beautiful Spring Boot!";
    }

    @GetMapping(value = "/Hello")
    public String hello(){
        return "Hello World!";
    }

    //path variable
    @RequestMapping(value = {"/path_params/{fname}/{lname}", "/path_params/{lname}"})
    public String namePathParams(@PathVariable(value = "fname", required = false) String firstName,
                                 @PathVariable("lname") String lastName){
        return "PathParams: " + firstName + " --- " + lastName;
    }

    //query params - PostFormData
    @RequestMapping(value = "/query_params", method = {RequestMethod.GET, RequestMethod.POST})
    public String nameQueryParams(@RequestParam("fname") String firstName,
                                  @RequestParam("lname") String lastName){
        return "QueryParams: " + firstName + " --- " + lastName;
    }

    //JSON Params and ...
    @PostMapping(value = "/body")
    public String bodyParams(@RequestBody String body){
        return body;
    }

    //JSON Params and ...
    @PostMapping(value = "/adv_body")
    public String bodyParams(@RequestBody Person person){
        return person.toString();
    }

    @GetMapping(value = "/people")
    public String people(){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Reza", "Hamidi"));
        people.add(new Person("Vahid", "Amiri"));
        people.add(new Person("Branko", "Ivancovic"));
        return new Gson().toJson(people);
    }
}
