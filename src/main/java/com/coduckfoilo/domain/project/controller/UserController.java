package com.coduckfoilo.domain.project.controller;

import com.coduckfoilo.domain.project.domain.Project;
import com.coduckfoilo.domain.project.domain.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/users")
public class UserController {

//    private List<User> users = new ArrayList<User>();

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("/form")
    public String form() {
        return "/user/form";
    }


    @PostMapping("")
    public String create(Project project) {
        System.out.println("project : " + project);
//        users.add(project);
        projectRepository.save(project);
        return "redirect:/users";
    }


    @GetMapping("")
    public String list(Model model) {
        model.addAttribute("users", projectRepository.findAll());
        return "/user/list";
    }

    @GetMapping("{id}/form")
    public String updateForm(@PathVariable Long id, Model model) {
        Project project = projectRepository.findOne(id);
        model.addAttribute("user", project);
        return "/user/updateForm";
    }

    @PostMapping("{id}")
    public String update(@PathVariable Long id, Project updateProject) {
        Project project = projectRepository.findOne(id);
        project.update(updateProject);
        projectRepository.save(project);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        projectRepository.delete(id);
        return "redirect:/users";
    }
}
