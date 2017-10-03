package pl.hansonq.firstApplication.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String registerPost(@RequestParam("login")String login,
                               @RequestParam("password")String password,
                               @RequestParam("passwordRepeat")String passwordRepeat){
        return password.equals(passwordRepeat) ? "Zarejestrowana poprawnie" : "Hasła nie sa takie same";
    }
}
