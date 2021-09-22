package tantanbody.login.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import tantanbody.login.service.LoginService;

@Controller
@Slf4j //logging
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     * 회원 가입
     * @return
     */
    @PostMapping("/join")
    public String join(Model model, String email, String name, String photo) throws Exception {
        String a = loginService.insertUser(email, name, photo);
        model.addAttribute("email", email);
        model.addAttribute("name", name);
        model.addAttribute("photo", photo);
        return "ok";
    }
}
