package home.igumnoff.recipesapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String greetings() {
        return "Приложение запущено";
    }
    @GetMapping("/info")
    public String information () {
        return "имя ученика- Игумнов Алексей Николаевич, " +
                "название проекта - Кулинарные рецепты, " +
                "датa создания проекта - 04.03.2023, " +
                "описание проекта - приложение с кулинарными рецептами .";
    }

}
