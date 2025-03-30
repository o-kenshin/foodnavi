package jp.pro.foodNavi.Login;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/login", "/register").permitAll() // ログイン・登録ページは誰でもアクセス可能
                        .anyRequest().authenticated() // それ以外のページは認証が必要
                )
                .formLogin(form -> form
                        .loginPage("/login") // カスタムログインページ
                        .defaultSuccessUrl("/home", true) // 成功後のリダイレクト先
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout") // ログアウト処理
                        .logoutSuccessUrl("/login") // ログアウト後のリダイレクト先
                        .permitAll()
                );

        return http.build();
    }
}
