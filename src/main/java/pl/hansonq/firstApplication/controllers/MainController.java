package pl.hansonq.firstApplication.controllers;

import ognl.JJTOgnlParserState;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;
import java.util.Random;

/**
 * Created by lukasz on 2017-10-02.
 */

@Controller
public class MainController {

    @RequestMapping(value = "/",method =  RequestMethod.GET)
   // @ResponseBody
    public String index(Model model){
        String[]baza= {"hi","hello","siema","cześć","Nara"};


        model.addAttribute("helloMsg",baza[new Random().nextInt(baza.length)]);
        return "index";
    }
    @RequestMapping(value = "/message/{text}",method =  RequestMethod.GET)
    @ResponseBody  //zwracanie czystego tekstu
    public String oskar(@PathVariable("text") String text){

        return "<center>"+text+"</center>";
    }
    @RequestMapping(value = "/age/{age}",method =  RequestMethod.GET)
    @ResponseBody  //zwracanie czystego tekstu
    public String age(@PathVariable("age") int age){

        return age >=18 ? "Jestes pełnoletni" : "Nie jestes pełnoletni";
    }
// żadanie GET służy do zapytania o strone

}
