// (28/08/23), 22:25
import java.util.*;
import java.lang.*;

public class Q13String {
// QUESTION: REMOVE ALL OCCERENCE OF A SUBSTRING
 static String remove(String s, char remove){
        String rtn = "";
        if(s.length() == 0) return rtn;
    if(s.charAt(0) != remove){
        rtn = rtn + s.charAt(0);
        return remove(s.substring(1),remove);
    }
    else return remove(s.substring(1),remove);
        
 }
    public static void main(String[] args) {
        String s = "aabba";
        char temp = 'a';
        String ans = remove(s,temp);
        System.out.println(ans);
        System.out.println("DONE!");
    }
}
