package jp.pro.foodNavi.Login;

import jp.pro.foodNavi.Home.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByuserName(String username);
}
