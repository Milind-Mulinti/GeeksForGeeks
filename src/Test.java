import java.util.Stack;

class GFG
{
    public static void main(String[] args) {

            String example1 = "({})";
            String example2 = "({[}]){";
            String example3 = "[]({}))";

            System.out.println(isBalance(example1));
            System.out.println(isBalance(example2));
            System.out.println(isBalance(example3));

    }

    private static boolean isBalance(String example1) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<example1.length(); i++){
           char ch = example1.charAt(i);
           if(ch=='(' || ch=='{' || ch=='[')
               st.push(ch);
           else
               if(st.isEmpty())
                   return false;
               else st.pop();
        }
        return st.isEmpty();
    }
}