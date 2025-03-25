package jp.pro.foodNavi.Home;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Shop {

    @Id
    @GeneratedValue
    private  Long storeId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    private String category;

    @Column(nullable = false)
    private String openhour;

    private String introduce;

    private String password;
}
