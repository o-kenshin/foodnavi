package jp.pro.foodNavi.Favorite;

import jp.pro.foodNavi.Home.Shop;
import jp.pro.foodNavi.Login.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {
    private FavoriteRepository favoriteRepository;

    //お気に入り追加
    public void addFavorite(User user, Shop shop){
        if(!favoriteRepository.existsByUserAndShop(user, shop)){
            Favorite favorite = new Favorite();
            favorite.setUser(user);
            favorite.setShop(shop);
        }
    }

    //お気に入り削除
    public void removeFavorite(User user, Shop shop){
        if(favoriteRepository.existsByUserAndShop(user ,shop)){
            favoriteRepository.deleteByUserAndShop(user, shop);
        }
    }

    //指定ユーザーのお気に入り一覧の取得
    public List<Favorite> getFavoriteByUser(User user){
        return favoriteRepository.findByUser(user);
    }

    //指定の店舗がユーザーのお気に入りか判定
    public boolean isFavorite(User user, Shop shop){
        return favoriteRepository.existsByUserAndShop(user, shop);
    }
}
