package Check;

public class Q002 {
    static void call(int n1, String s) {
        if (n1 == 5)
            return;
        // n1 = n1 + 1;
        // s = s + 'A';
        call(n1 + 1, s);
    }

    public static void main(String[] args) {
        int x = 8;
        switch (x) {
            default:
                System.out.println("DDD");
                // break;
            case 4:
                System.out.println("444");
                break;
            case 9:
                System.out.println("888");
                break;

        }
    }
}
