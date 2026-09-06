import java.util.*;

class Solution3945 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Integer> mp = new HashMap<>();

        while (n > 0) {
            int d = n % 10;

            if (mp.containsKey(d)) {
                mp.put(d, mp.get(d) + 1);
            } else {
                mp.put(d, 1);
            }

            n /= 10;
        }

        int ans = 0;

        for (int i = 0; i <= 9; i++) {
            if (mp.containsKey(i)) {
                ans += i * mp.get(i);
            }
        }

        System.out.println(ans);
    }
}