package jp.pro.foodNavi;

import jp.pro.foodNavi.registController.ShopInfo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class ShopListDao {
    private  final JdbcTemplate jdbcTemplate;
    ShopListDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    public void regist(ShopInfo shopInfo){
        SqlParameterSource param;
    }
}
