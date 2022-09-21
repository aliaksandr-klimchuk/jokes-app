package alex.klimchuk.jokesapp.controllers;

import alex.klimchuk.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright Alex Klimchuk (c) 07.09.2021.
 */
@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"", "/"})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "/index";
    }

}
