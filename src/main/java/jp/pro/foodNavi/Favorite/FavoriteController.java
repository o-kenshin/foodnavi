package jp.pro.foodNavi.Favorite;

import jp.pro.foodNavi.Home.Shop;
import jp.pro.foodNavi.Home.ShopRepository;
import jp.pro.foodNavi.Login.User;
import jp.pro.foodNavi.Login.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@Data
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ShopRepository shopRepository;

    //お気に入りに登録
    @PostMapping("/addFavo/{shopId}")
    public String addFavorite(@PathVariable Long shopId){
        User user = getLogInUser();
        Shop shop = shopRepository.findById(shopId).orElse(null);
        if(user != null && shop !=null){
            favoriteService.addFavorite(user,shop);
        }

        return "redirect:/";
    }

    //お気に入り解除
    @PostMapping("/cancel/{storeId}")
    public String removeFavorite(@PathVariable Long storeId){
        User user = getLogInUser();
        Shop shop = shopRepository.findById(storeId).orElse(null);
        if (user != null && shop != null) {
            favoriteService.removeFavorite(user, shop);
        }
        return "redirect:/";
    }

    //お気に入り一覧表示
    @GetMapping("/favoList")
    public String favoriteList(Model model){
        User user = getLogInUser();
        List<Favorite> favorites = favoriteService.getFavoriteByUser(user);
        model.addAttribute("favorites",favorites);
        return "favoriteList";
    }

    private User getLogInUser(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        return userRepository.findByuserName(username);
    }

}
