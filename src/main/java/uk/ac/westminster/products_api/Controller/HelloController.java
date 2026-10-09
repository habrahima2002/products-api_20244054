package uk.ac.westminster.products_api.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello from spring  boots, Welcome!";
    }


    @GetMapping("/status")
    public String status() {
         return "OK " + LocalDate.now().toString();
    }

    @GetMapping("/goodbye")
    public String goodBye() {
        return(PersonController.class.getName());
    }


}
