package royhq.budget.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BudgetController {
    @GetMapping("/hello")
    public String getHelloMessage() {
        return "Hello Spring Boot!";
    }
}
