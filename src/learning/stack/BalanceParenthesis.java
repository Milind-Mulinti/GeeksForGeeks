package learning.stack;

import java.util.ArrayDeque;

public class BalanceParenthesis {

    static boolean isBalance(String value){
        ArrayDeque<Character> st = new ArrayDeque<>();
        for(int i=0; i<value.length(); i++){
            char ch = value.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else{
                if(st.isEmpty())
                    return  false;
                else
                    st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String example1 = "({})";
        String example2 = "({[}])";
        String example3 = "[]({}))";

        System.out.println(isBalance(example1));
        System.out.println(isBalance(example2));
        System.out.println(isBalance(example3));
    }
}
