package jp.pro.foodNavi.Login;

import jp.pro.foodNavi.Home.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByuserName(String username);
}
