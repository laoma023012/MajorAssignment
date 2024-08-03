package maxiaochen;

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
        if(status == 1)
        {
            System.out.println("Hi " + userName + " Welcome Task List");
            ConstructStatus.constructData.forEach((k, v) -> {
                System.out.println("任务序号: " + k + "\t任务名称\t" + v.frontShowData + "\t奖励内容\t" + v.RewardData + "\n");
            });
        }
        else {
            System.out.println("未登录");
        }
    }
}
