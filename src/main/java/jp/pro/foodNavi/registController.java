package jp.pro.foodNavi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class registController {

    record ShopInfo(String name,String addres, String category, String openhour, String introduce){}
    private List<ShopInfo> shopInfos = new ArrayList<>();


    @GetMapping("/add")
    public String regist(){

        return "index";
    }

}
