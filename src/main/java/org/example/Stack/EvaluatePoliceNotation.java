package org.example.Stack;

import java.util.Stack;

public class EvaluatePoliceNotation {
    public  static int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+") || token.equals("-") ||
                    token.equals("*") || token.equals("/")) {

                int b = st.pop();
                int a = st.pop();

                if (token.equals("+")) {
                    st.push(a + b);
                } else if (token.equals("-")) {
                    st.push(a - b);
                } else if (token.equals("*")) {
                    st.push(a * b);
                } else {
                    st.push(a / b);
                }

            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.peek();
    }

    public static void main(String[] args) {
            String[]tokens = {"4","13","5","/","+"};
            int ans=evalRPN(tokens);
        System.out.println(ans);
    }
}
