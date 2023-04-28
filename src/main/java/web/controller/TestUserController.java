package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.User;
import web.service.UserService;

@Controller
public class TestUserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/add-data")
    public String addTestUserData(Model model) {
        userService.add(new User("Ivan", "Petrov", (byte) 18, 50000));
        userService.add(new User("Petr", "Sidorov", (byte) 26, 70000));
        userService.add(new User("Anton", "Ivanov", (byte) 30, 100000));
        userService.add(new User("Mihail", "Fedorov", (byte) 35, 120000));
        return "redirect:/users";
    }

}