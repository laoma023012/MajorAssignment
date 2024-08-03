package maxiaochen;

import java.util.HashMap;

public class TaskStatus {
    /*前端展示任务名称*/
    public String frontShowData = "";
    /*前端展示奖励名称*/
    public String RewardData = "";
    /*用户名称*/
    public String UserNama = "";
    /*用户名称*/
    public int RewardStatus = 0;

    public HashMap<String, String> userReward = new HashMap<String, String>(){
        {
            put("Read Action", "Gold");
            put("Write Action", "Gold*2");
        }
    };

    public void setFrontShowData(String frontShowData) {
        this.frontShowData = frontShowData;
    }
    public void setRewardData(String RewardData) {
        this.RewardData = RewardData;
    }
    public void setUserNama(String UserNama) {
        this.UserNama = UserNama;
    }

    public void setRewardStatus(String RewardStatusName){
        if(RewardStatusName.equals("Read Action") || RewardStatusName.equals("Write Action"))
        {
            this.RewardStatus = 1;
            System.out.println(userReward.get(RewardStatusName));
        }
    }

}
