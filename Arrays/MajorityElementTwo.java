import java.util.ArrayList;
import java.util.List;

public class MajorityElementTwo {
    public static void main(String[] args){
        int[] arr = { 1, 2, 1, 1, 3, 2, 2};

        List<Integer> li = new ArrayList<>();

        int cnt1 = 0, cnt2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(cnt1 == 0 && arr[i] != ele2){
                ele1 = arr[i];
                cnt1++;
            }
            else if(cnt2 == 0 && arr[i] != ele1){
                ele2 = arr[i];
                cnt2++;
            }
            else if(arr[i] == ele1){
                cnt1++;
            }
            else if(arr[i] == ele2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for(int i = 0; i < arr.length; i++ ){
            if(arr[i] == ele1){
                cnt1++;
            }
            if(arr[i] == ele2){
                cnt2++;
            }
        }

        if(cnt1 > arr.length / 3){
            li.add(ele1);
        }
        if(cnt2 > (arr.length / 3) && ele1 != ele2) {
            li.add(ele2);
        }

        System.out.print(li);
    }
}
