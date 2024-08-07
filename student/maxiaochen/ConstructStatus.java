package maxiaochen;

import java.util.HashMap;

public class ConstructStatus {
    public static HashMap<Integer, TaskStatus> constructData = new HashMap<>();

    private static TaskStatus getTaskData_1(String UserName, String RewardTip)
    {

        TaskStatus task_1 = new TaskStatus();
        task_1.setFrontShowData("参与平安人生活动");
        task_1.setRewardData("获得 10 金币");
        task_1.setUserNama(UserName);
        task_1.setRewardStatus(RewardTip);
        return task_1;
    }

    private static TaskStatus getTaskData_2(String UserName, String RewardTip)
    {
        TaskStatus task_2 = new TaskStatus();
        task_2.setFrontShowData("关注金管家公众号");
        task_2.setRewardData("获得 20 金币");
        task_2.setUserNama(UserName);
        task_2.setRewardStatus(RewardTip);
        return task_2;
    }

    private static TaskStatus getTaskData_3(String UserName, String RewardTip)
    {
        TaskStatus task_3 = new TaskStatus();
        task_3.setFrontShowData("获取您的专属规划");
        task_3.setRewardData("获得 10 金币");
        task_3.setUserNama(UserName);
        task_3.setRewardStatus(RewardTip);
        return task_3;
    }

    public static void setTaskMap(String UserName, String tip){
        constructData.put(1, getTaskData_1(UserName, tip));
        constructData.put(2, getTaskData_2(UserName, tip));
        constructData.put(3, getTaskData_3(UserName, tip));
    }

}
