package pl.hansonq.firstApplication.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerPost(@RequestParam("login") String login,
                               @RequestParam("password") String password,
                               @RequestParam("passwordRepeat") String passwordRepeat,
                               Model model){
        String text = password.equals(passwordRepeat) ? "Zarejestrowano poprawnie" : "Hasła nie sa takie same";
        model.addAttribute("info", text);
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPost(){
        return "register";
    }
}