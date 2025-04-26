package org.lnc.controllers;

import org.lnc.model.User;
import org.lnc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/public")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/freelancers")
    public List<User> getAllFreelancers() {
        return userService.getUsersByRole("FREELANCER");
    }

    @GetMapping("/freelancer/{id}")
    public User getFreelancerProfile(@PathVariable Long id) {
        return userService.getById(id);
    }
}
