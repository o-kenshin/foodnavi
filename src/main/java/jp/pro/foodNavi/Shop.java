package jp.pro.foodNavi;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@Entity
public class Shop {

    @Id
    @GeneratedValue
    private  Long storeId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String addres;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String openhour;

    @Column(nullable = false)
    private String introduce;
}
