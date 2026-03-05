package at.spengergasse.spring_thymeleaf.controllers;

import at.spengergasse.spring_thymeleaf.entities.SeriesAndMovies;
import at.spengergasse.spring_thymeleaf.entities.SMRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SMController {

    private final SMRepository repo;

    public SMController(SMRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/series-movies")
    public String index() {
        return "smindex";
    }

    @GetMapping("/series-movies/manage")
    public String list(Model model) {
        model.addAttribute("items", repo.findAll());
        return "smlist";
    }

    @GetMapping("/series-movies/new")
    public String create(Model model) {
        model.addAttribute("sm", new SeriesAndMovies());
        return "smform";
    }

    @PostMapping("/series-movies/save")
    public String save(@ModelAttribute SeriesAndMovies sm) {
        repo.save(sm);
        return "redirect:/series-movies/manage";
    }

    @GetMapping("/series-movies/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("sm", repo.findById(id).orElse(null));
        return "smform";
    }

    @GetMapping("/series-movies/delete/{id}")
    public String delete(@PathVariable int id) {
        repo.deleteById(id);
        return "redirect:/series-movies/manage";
    }
}