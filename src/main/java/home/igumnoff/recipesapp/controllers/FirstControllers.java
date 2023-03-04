package home.igumnoff.recipesapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstControllers {

    @GetMapping("/")
    public String helloWorld() {
        return "приложение запущено";
    }
    @GetMapping("/info")
    public String info () {
        return "приложение запущено";
    }

}
