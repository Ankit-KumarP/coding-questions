// (29/08/23), 20:16
import java.util.*;
import java.lang.*;
public class Q14String {
    // QUES: SKIP AP BUT NOT SKIP APP
static String skipApNotApp(String s, StringBuilder rtn){
    if(s.isEmpty()) return rtn.toString();
    if(s.startsWith("abc")){
        return skipApNotApp(s.substring(1),rtn);
    }
    else {
         rtn.append(s.charAt(0));
        return skipApNotApp(s.substring(1),rtn);
    }
}

    public static void main(String[] args) {
        String s = "dababc";
        StringBuilder sb = new StringBuilder();
        String ans = skipApNotApp(s,sb);
        System.out.println(ans);
        System.out.println("DONE");
    }
}
