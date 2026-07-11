import java.util.HashSet;

public class LongestConsecutiveSequence_ {
    public static void main(String[] args){
        int[] nums = {102, 4, 100, 1, 101, 3, 2, 1};

        HashSet<Integer> hSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hSet.add(nums[i]);
        }

        int longest = 1;
        for(int num : hSet){
            if(!hSet.contains(num - 1)){
                int st = num;
                int cnt = 1;

                while(hSet.contains(st + 1)){
                    cnt++;
                    st++;
                }
                if(cnt > longest){
                    longest = cnt;
                }
            }
        }
        System.out.print("Longest Consecutive Sequence : " + longest);
    }
}
