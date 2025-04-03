package jp.pro.foodNavi.Login;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    public Long userId;

    @Column(nullable = false)
    public String userName;

    public int age;

    @Column(nullable = false)
    public String password;

    @Column(nullable = false)
    private String role;


    @PrePersist
    public void DefaultRoleSet(){
        if(this.role==null){
            role="USER";
        }
    }

}
