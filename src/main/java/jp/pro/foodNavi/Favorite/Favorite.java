package jp.pro.foodNavi.Favorite;

import jakarta.persistence.*;
import jp.pro.foodNavi.Home.Shop;
import jp.pro.foodNavi.Login.User;
import lombok.Data;

@Data
@Entity
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId") // 外部キー
    private User user;

    @ManyToOne
    @JoinColumn(name = "storeId") // 外部キー
    private Shop shop;
}
