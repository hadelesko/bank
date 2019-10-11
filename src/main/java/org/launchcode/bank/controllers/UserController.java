package org.launchcode.bank.controllers;


import org.launchcode.bank.models.daos.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "")
    public String index(Model model){
        model.addAttribute("title", "Bank of the community");
        model.addAttribute("users", userDao.findAll());
        return "user/index";
    }

}
