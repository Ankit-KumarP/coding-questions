// (28/08/23), 21 : 42
import java.util.*;
import java.lang.*;
public class Q12String2 {
    // QUES: CREATE NEW STRING BY SKIPPING SOME CHARACTER ( PASSING RTN ARGUMENT IN FUNCTION BODY)
    static String newS(String s, char remove, StringBuilder rtn){
        if(s.length() == 0) return rtn.toString();
        if(s.charAt(0) != remove){
            rtn.append(s.charAt(0));
            return newS(s.substring(1), remove,rtn);
        }
        else return newS(s.substring(1),remove,rtn);
    }
    public static void main(String[] args) {
       String s = "aabba";
       char temp = 'a';
       StringBuilder rtn = new StringBuilder();
       String ans = newS(s,temp,rtn);
       System.out.println(ans);

               
    }
}
