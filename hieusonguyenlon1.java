
import java.math.BigInteger;
import java.util.Scanner;

public class hieusonguyenlon1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String a = sc.next(), b = sc.next();
            BigInteger A = new BigInteger(a);
            BigInteger B = new BigInteger(b);
            String k = ((A.subtract(B)).abs()).toString();
            int tmp;
            if (a.length() > b.length()) {
                tmp = a.length();
            } else {
                tmp = b.length();
            }
            int res = tmp - k.length();
            for (int i = 0; i < res; i++) {
                System.out.print('0');
            }
            System.out.println(k);
        }
    }
}
