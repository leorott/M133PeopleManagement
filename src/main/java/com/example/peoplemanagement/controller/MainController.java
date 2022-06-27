package com.example.peoplemanagement.controller;

import com.example.peoplemanagement.model.Person;
import com.example.peoplemanagement.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @Autowired
    private PersonRepository personRepository;
    public @ResponseBody Iterable<Person> getAllPeople() {
        return personRepository.findAll();
    }
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("people", getAllPeople());
        return "index";
    }

    @RequestMapping("/add")
    public String add(Model model){
        model.addAttribute("person", new Person());
        return "add";
    }

    @PostMapping("/create")
    public String add(Person person){
        personRepository.save(person);
        return "redirect:/";
    }
}
