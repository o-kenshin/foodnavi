package jp.pro.foodNavi.Login;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Data
@Controller
public class RegistrationController {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/adduser")
    public String registUser(@ModelAttribute User user, Model model){
        if (userRepository.findByuserName(user.getUserName())!=null) {
            model.addAttribute("error", "このユーザー名は既に使用されています");
            return "loginForm";
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "loginForm";
    }


}
