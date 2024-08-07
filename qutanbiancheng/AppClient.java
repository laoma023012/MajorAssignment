import java.util.Scanner;

public class AppClient {
    public static void main(String[] args) {
        // 1. 提供入口供用户登录 注册
        System.out.println("如果已注册，请输入login后再输入用户名密码登录系统，如没有则输入register进行注册");
        while (true) {
            System.out.println("请输入指令进行活动");
            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();
            if ("login".equals(command)) {
                String userName = sc.nextLine();
                String password = sc.nextLine();
                Login.login(userName,password);
            }
            if ("register".equals(command)) {
                String userName = sc.nextLine();
                String password = sc.nextLine();
                Login.register(userName,password);
            }
        }
    }
}
