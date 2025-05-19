package jp.pro.foodNavi.Favorite;

import jp.pro.foodNavi.Home.Shop;
import jp.pro.foodNavi.Login.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    List<Favorite> findByUser(User user);
    boolean existsByUserAndShop(User user, Shop shop);
    void deleteByUserAndShop(User user, Shop shop);
}
