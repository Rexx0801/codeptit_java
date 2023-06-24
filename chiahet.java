
import java.math.BigInteger;
import java.util.Scanner;

public class chiahet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] n = s.split("\\s+");
            String a = n[0], b = n[1];
            BigInteger A = new BigInteger(a);
            BigInteger B = new BigInteger(b);
            BigInteger x = A.mod(B);
            BigInteger y = B.mod(A);
            if (x.toString() == "0" || y.toString() == "0") {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
