package learning.recursion;

public class Test {
    public static void main(String[] args) {
        getSum(253);
    }

    private static int getSum(int n) {
        if(n==0)
            return 0;

        return getSum(n/10)+n%10;
    }

    private static boolean isPalindrome(String aba, int i, int i1) {
        if(i>=i1)
            return true;
        return (aba.charAt(i)==aba.charAt(i1)) && isPalindrome(aba,i+1,i1-1);
    }


}
