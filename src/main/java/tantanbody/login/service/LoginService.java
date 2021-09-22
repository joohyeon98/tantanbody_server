package tantanbody.login.service;

import tantanbody.model.LoginModel;

public interface LoginService {
    public String insertUser(String email, String name, String photo) throws Exception;
}
