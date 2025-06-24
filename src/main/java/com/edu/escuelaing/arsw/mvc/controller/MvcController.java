package com.edu.escuelaing.arsw.mvc.controller;

import com.edu.escuelaing.arsw.mvc.domain.ports.MvcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mvc")
public class MvcController {

    @GetMapping
    public String getHtml(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
                          Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
