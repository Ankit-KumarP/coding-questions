// (05/10/23) : 18:11
public class Q021subString {
    // substring
    static private void substring(String s, String str, int ptr, String[] arr) {
        if (ptr == s.length()) {
            if (isPalindrome(str) && str.equals("aacakacaa"))
                System.out.print(str + " ");
            return;
        }

        // take
        substring(s, str + s.charAt(ptr), ptr + 1, arr);

        // not take
        substring(s, str, ptr + 1, arr);
    }

    // isPalindrome
    static private boolean isPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        String arr[] = new String[3];
        substring("aacabdkacaa", "", 0, arr);
    }
}
