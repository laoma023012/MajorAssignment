package maxiaochen;

import java.util.ArrayList;
import java.util.Scanner;

public class UserRewardData {
    private int getLoginStatus(){
        return UserLoadSystem.loginStatusData;
    }
    public void userAccessData(){
        int status = getLoginStatus();
        String userName = UserLoadSystem.getUserName();
        String tips = " ";
        ConstructStatus st = new ConstructStatus();
        st.setTaskMap(userName, tips);
        ArrayList<String> lineData  = new ArrayList<>();
        Scanner scanner2 = new Scanner(System.in);
        if(status == 1)
        {
            System.out.println("Hi " + userName + " Welcome Task List");
            ConstructStatus.constructData.forEach((k, v) -> {
                System.out.println("任务序号: " + k + "\t任务名称\t" + v.frontShowData + "\t奖励内容\t" + v.RewardData + "\n");
            });
            System.out.println("Please Input Your Task Number: \n " + "Go ->");
            String taskNumber = scanner2.nextLine();
            System.out.println("OK Let's Go ->" + taskNumber);
            while (scanner2.hasNextLine() && !((scanner2.nextLine()).equals(""))) {
                System.out.println("Your current action is " + taskNumber);
                lineData.add(scanner2.nextLine());
            }
            lineData.forEach(
                    (k) ->
                    {
                        System.out.println("You have already done " + k + "\n");
                        TaskStatus ts = ConstructStatus.constructData.get(Integer.parseInt(taskNumber));
                        ts.setRewardStatus(k);
                    }
            );
        }
        else {
            System.out.println("未登录");
        }
    }
}
