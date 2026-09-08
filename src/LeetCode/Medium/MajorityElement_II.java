import java.util.ArrayList;
import java.util.List;

public class MajorityElement_II {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 1, 2, 1};

        Solution229 sol = new Solution229();
        List<Integer> ans = sol.majorityElement(nums);

        System.out.print("Majority element/s : " + ans);
    }
}

class Solution229{
    public List<Integer> majorityElement(int[] nums){
        List<Integer> li = new ArrayList<>();

        int cnt1 = 0, cnt2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(cnt1 == 0 && nums[i] != ele2){
                ele1 = nums[i];
                cnt1++;
            }
            else if(cnt2 == 0 && nums[i] != ele1){
                ele2 = nums[i];
                cnt2++;
            }
            else if(nums[i] == ele1){
                cnt1++;
            }
            else if(nums[i] == ele2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0; cnt2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == ele1){
                cnt1++;
            }
            if(nums[i] == ele2){
                cnt2++;
            }
        }

        if(cnt1 > nums.length / 3){
            li.add(ele1);
        }
        if(cnt2 > nums.length / 3 && ele2 != ele1){
            li.add(ele2);
        }

        return li;
    }
}