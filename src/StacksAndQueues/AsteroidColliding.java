package StacksAndQueues;
import java.util.Arrays;
import java.util.Stack;

class Solution12{
    public int[] asteroidCollision(int[] asteroids){
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < asteroids.length; i++){

            if(i == 0 && asteroids[0] < 0){
                st.push(asteroids[0]);
                continue;
            }

            if(asteroids[i] > 0){
                st.push(asteroids[i]);
            }
            else{
                int crash = Math.abs(asteroids[i]);
                if(!st.isEmpty() && st.peek() > 0){
                    if(st.peek() > crash){
                        continue;
                    }
                    else if(st.peek() == crash){
                        st.pop();
                        continue;
                    }
                    else{
                        while(!st.isEmpty() && st.peek() > 0 && st.peek() <= crash){
                            if(st.peek() == crash){
                                st.pop();
                                break;
                            }
                            st.pop();
                        }
                        if(!st.isEmpty() && st.peek() > crash){
                            continue;
                        }
                        st.push(asteroids[i]);
                    }
                }
                else{
                    st.push(asteroids[i]);
                }
            }
        }

        int[] ans = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            ans[i] = st.get(i);
        }

        return ans;
    }
}

public class AsteroidColliding {
    public static void main(String[] args) {
        Solution12 sol = new Solution12();

        int[] asteroids = {-2,2,1,-2};

        System.out.print(Arrays.toString(sol.asteroidCollision(asteroids)));
    }
}
