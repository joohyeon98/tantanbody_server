package tantanbody.login.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    public String setUser() throws Exception;
}
