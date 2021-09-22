package tantanbody.login.serviceImpl;

import org.springframework.stereotype.Service;
import tantanbody.login.mapper.LoginMapper;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements tantanbody.login.service.LoginService {
    @Resource
    private LoginMapper loginMapper;

    @Override
    public String insertUser(String email, String name, String photo) throws Exception {
        return loginMapper.setUser();
    }
}
