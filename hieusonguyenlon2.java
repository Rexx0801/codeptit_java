
import java.math.BigInteger;
import java.util.Scanner;

public class hieusonguyenlon2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        String k = ((A.subtract(B))).toString();
        System.out.println(k);
    }
}
