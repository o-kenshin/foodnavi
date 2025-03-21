package jp.pro.foodNavi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class registController {
    private final ShopRepository repository;



    @PostMapping("/add")
    public String registShop(@ModelAttribute Shop shop){
        repository.save(shop);
        return "redirect:/";
    }

}
