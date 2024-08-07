import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 登录类
 */
public class Login {

    /**
     * TODO 后续会改造，暂时使用用户名作为唯一标识
     */
    private static Map<String,String> userNameToPasswordMap = new HashMap<>();

    /**
     * 登录
     * @param userId 用户的userID
     * @param passWord 用户的密码
     * @return true: 登录成功  false: 登录失败
     */
    public static boolean login(String userId, String passWord) {
        String realPassword = userNameToPasswordMap.get(userId);
        if (realPassword == null) {
            System.out.println("您还未注册，请先进行注册");
            return false;
        }
        if (!realPassword.equals(passWord)) {
            System.out.println("密码输入失败，请重新登录！");
            return false;
        }
        System.out.println("登录成功！");
        return true;
    }

    /**
     * 用户注册
     * @param userName 用户名
     * @param password 密码
     * @return true: 注册成功  false：注册失败
     */
    public static boolean register(String userName, String password) {
        if (StringUtils.compare(userNameToPasswordMap.get(userName),password) == 0) {
            System.out.println("您已注册过了，无需重复注册");
            return true;
        }
        userNameToPasswordMap.put(userName,password);
        System.out.println("恭喜您，注册成功！");
        return true;
    }
}
