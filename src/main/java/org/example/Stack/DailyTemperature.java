package org.example.Stack;

import java.util.*;

public class DailyTemperature {
    public  static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();

        // next greater on right
        int[] ans = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            while (!st.isEmpty() &&
                    temperatures[st.peek()] < temperatures[i]) {

                int index = st.pop();
                ans[index] = i - index;
            }

            st.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr={73,74,75,71,69,72,76,73};
//       o/p: [1,1,4,2,1,1,0,0]
       int[]ans= dailyTemperatures(arr);
       for(int it:ans){
           System.out.print(it + " ");
       }
    }
}
