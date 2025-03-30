package jp.pro.foodNavi.Login;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    public Long userId;

    @Column(nullable = false)
    public String userName;

    @Column(nullable = false)
    public String password;

    @Column(nullable = false)
    private String role;

}
