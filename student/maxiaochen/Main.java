package maxiaochen;

public class Main {
    public static void main(String[] args) {
        UserLoadSystem sysData = new UserLoadSystem();
        UserRewardData sysUser = new UserRewardData();
        sysData.authenticationPasswd();
        sysUser.userAccessData();
    }
}
