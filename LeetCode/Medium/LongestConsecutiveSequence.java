import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args){
        int[] nums = {102, 4, 100, 1, 101, 3, 2, 1, 1};

        Solution128 sol = new Solution128();
        int res = sol.longestConsecutive(nums);

        System.out.print("Longest consecutive sequence : " + res);
    }
}

class Solution128{
    public int longestConsecutive(int[] nums){
        if (nums.length == 0) return 0;

        int longest = 1;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num - 1)){
                int cnt = 1;
                int st = num;

                while(set.contains(st + 1)){
                    cnt++;
                    st++;
                }
                if(cnt > longest){
                    longest = cnt;
                }
            }
        }
        return longest;
    }
}