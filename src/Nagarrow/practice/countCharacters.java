package Nagarrow.practice;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class countCharacters {
    public static String fun(String s){

        Map<Character,Integer> map = new TreeMap<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        StringBuilder mapAsString = new StringBuilder();
        for (char key : map.keySet()) {
            mapAsString.append(key + "" + map.get(key));
        }
        return mapAsString.toString();
    }

    static void printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recurvise call
            printPermutn(ros, ans + ch);
        }
    }
    public static void main(String[] args) {
        String s1 =  "aaahhcccddaah";
        String result =fun(s1);
        System.out.println(result);

        /*String s = "abb";
        printPermutn(s, "");*/
    }
}
