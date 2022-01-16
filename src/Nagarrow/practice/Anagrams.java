package Nagarrow.practice;

import java.util.Arrays;
import java.util.Locale;

public class Anagrams {
    static boolean isAnagrams(String s1,String s2){
        boolean status = false;

        char arr1[] = s1.toLowerCase().toCharArray();
        char arr2[] = s2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        status = Arrays.equals(arr1,arr2);


        return status;

    }

    public static void main(String[] args) {
        isAnagrams("nayan","mayank");
    }
}
