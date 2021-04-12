package learning.linkedList;

import java.util.Stack;

public class Palindrome {
    public static boolean isPalindrome(Node head)
    {
        Stack<Integer> st = new Stack<>();
        boolean ispalin = true;
        if(head == null) return false;

        Node temp = head;

        while (temp !=null){
            st.push(temp.data);
            temp = temp.next;
        }

        while (head!=null){
            int i = st.pop();
            if(i == head.data)
                ispalin = true;
            else
            {
                ispalin = false;
                break;
            }
            head = head.next;
        }


        return ispalin;
    }
}
