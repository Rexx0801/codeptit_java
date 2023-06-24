
import java.util.Scanner;

public class dienthoaicucgach {

    public static int check(char x) {
        if (x == 'A' || x == 'B' || x == 'C') {
            return 2;
        }
        if (x == 'D' || x == 'E' || x == 'F') {
            return 3;
        }
        if (x == 'G' || x == 'H' || x == 'I') {
            return 4;
        }
        if (x == 'J' || x == 'K' || x == 'L') {
            return 5;
        }
        if (x == 'M' || x == 'N' || x == 'O') {
            return 6;
        }
        if (x == 'P' || x == 'Q' || x == 'R' || x == 'S') {
            return 7;
        }
        if (x == 'T' || x == 'U' || x == 'V') {
            return 8;
        }
        return 9;
    }

    public static boolean stn(String s) {
        for (int i = 0; i <= s.length() / 2; i++) {
            if (check(s.charAt(i)) != check(s.charAt(s.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String k = s.toUpperCase();
            if (stn(k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
