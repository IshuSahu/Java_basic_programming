import java.util.*;
public class BackTracking {
    public static void PrintPermutation(String s, String perm, int index){

        if(s.length()==0){
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char currStr = s.charAt(i);
            String newStr = s.substring(0, i) + s.substring(i+1);
            PrintPermutation(newStr,perm+currStr, index+1);
        }
    }
    public static void main(String[] args) {
        String str ="ABC";
        PrintPermutation(str,"",0);
    }

    
}
