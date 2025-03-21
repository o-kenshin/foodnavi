package jp.pro.foodNavi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
