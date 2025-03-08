package jp.pro.foodNavi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    String home(){
        return "index";
    }

    @GetMapping("/search")
    public String showSearchForm() {
        return "search"; // search.html を表示
    }

    @GetMapping("/register")
    public String registerForm() {
        return "registerForm"; // registerForm.html を表示
    }

}
