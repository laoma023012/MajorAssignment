import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Login {

    Map<String,String> userIdToPasswordMap = new HashMap<>();

    /**
     * 登录
     * @param userId 用户的userID
     * @param passWord 用户的密码
     * @return true: 登录成功  false: 登录失败
     */
    public boolean login(String userId, String passWord) {
        if (StringUtils.compare(userIdToPasswordMap.get(userId),passWord) == 0) {
            // 密码匹配
            return true;
        }
        return false;
    }
}
