package jp.pro.foodNavi.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

    @GetMapping("/login")
    public String showLoginForm(){

        return "loginForm";
    }

    @GetMapping("/signup")
    public String showUserRegister(){

        return "UserRegister";
    }

}
