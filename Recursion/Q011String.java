//  (28/08/23) : 21:00
    import java.util.*;
    import java.lang.*;
public class Q011String {
    // QUES: CREATE A NEW STRING FROM GIVEN STRING BY REMOVING A CHARACTER
    static String newS(String s, int ptr, char rem , StringBuilder sb){
        if(ptr == s.length()) return sb.toString();
        if(s.charAt(ptr) != rem) sb.append(s.charAt(ptr));
        return newS(s,ptr+1,rem,sb);
    }
    public static void main(String[] args) {
        String s = "abaca";
        char remove = 'a';
        StringBuilder sb = new StringBuilder();
        String ans = newS(s,0,remove,sb);
        System.out.println(ans);
    }
}
