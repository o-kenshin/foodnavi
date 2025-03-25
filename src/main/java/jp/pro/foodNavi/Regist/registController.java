package jp.pro.foodNavi.Regist;

import jp.pro.foodNavi.Home.Shop;
import jp.pro.foodNavi.Home.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
