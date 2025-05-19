package jp.pro.foodNavi.Home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class HomeController {
    @GetMapping("/")
    String home(){
        return "index";
    }


    @GetMapping("/register")
    public String registerForm() {
        return "registerForm"; // registerForm.html を表示
    }



}
