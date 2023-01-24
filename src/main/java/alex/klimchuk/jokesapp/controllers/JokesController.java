package alex.klimchuk.jokesapp.controllers;

import alex.klimchuk.jokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright Alex Klimchuk (c) 07.09.2021.
 */
@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"", "/"})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokesService.getJoke());
        return "/index";
    }

}
