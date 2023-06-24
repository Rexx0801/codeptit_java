
import java.util.Scanner;

public class uocsochunglonnhatcuasonguyenlon {

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            String s = sc.next();
            long b = 0;
            for (int i = 0; i < s.length(); i++) {
                b = b * 10 + (s.charAt(i) - '0');
                b %= a;
            }
            System.out.println(gcd(a, b));
        }
    }
}
