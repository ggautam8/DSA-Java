import java.util.Arrays;
import java.util.Stack;

class Solution735{
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int asteroid = asteroids[i];
            boolean alive = true;

            while (alive && asteroid < 0 && !st.isEmpty() && st.peek() > 0) {
                if (st.peek() < Math.abs(asteroid)) {
                    st.pop();
                }
                else if (st.peek() == Math.abs(asteroid)) {
                    st.pop();
                    alive = false;
                }
                else {
                    alive = false;
                }
            }

            if (alive) {
                st.push(asteroid);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            ans[i] = st.get(i);
        }

        return ans;
    }
}

public class AsteroidCollision {
    public static void main(String[] args) {
        Solution735 sol = new Solution735();

        int[] asteroids = {-2,2,1,-2};

        System.out.print(Arrays.toString(sol.asteroidCollision(asteroids)));
    }
}
