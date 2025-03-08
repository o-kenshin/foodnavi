package jp.pro.foodNavi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class registController {
    @GetMapping("/add")
    public String regist(){

        return "index";
    }
}
