package org.example.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmaller {
    public  static  int[]nextGreaterInLeft(int[]nums){
        int[]result=new int[nums.length];
        Stack<Integer>st=new Stack<>();
        Arrays.fill(result,-1);
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
          if(!st.isEmpty()){
              result[i]=nums[st.peek()];
          }
            st.push(i);
        }
        return  result;

    }
    public  static  int[]nextGreaterOnRight(int[]nums){
        int[]result=new int[nums.length];
        Stack<Integer>st=new Stack<>();
        Arrays.fill(result,-1);
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                result[st.pop()]=nums[i];
            }

            st.push(i);
        }
        return  result;

    }
    public  static  int[]nextSmallerInLeft(int[]nums){
        int[]result=new int[nums.length];
        Stack<Integer>st=new Stack<>();
        Arrays.fill(result,-1);
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                result[i]=nums[st.peek()];
            }
            st.push(i);
        }
        return  result;

    }
    public  static  int[]nextSmallerInRight(int[]nums){
        int[]result=new int[nums.length];
        Stack<Integer>st=new Stack<>();
        Arrays.fill(result,-1);
       for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                 result[st.pop()]=nums[i];
            }
            st.push(i);
        }
       return  result;

    }
    public static void main(String[] args) {
        int[]nums={4, 5, 2, 10, 8};
//        int[]ans=nextSmallerInRight(nums);
//        int[]ans=nextSmallerInLeft(nums);
//        int[]ans=nextGreaterOnRight(nums);
        int[]ans=nextGreaterInLeft(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+ " ");
        }

    }
}
