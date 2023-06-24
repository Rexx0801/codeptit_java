
import java.util.Scanner;
import java.util.StringTokenizer;

public class chuanhoaxauhoten1 {

    public static String xl(String s) {
        String res = "";
        char tmp = s.charAt(0);
        if (Character.isLowerCase(tmp)) {
            tmp -= 32;
            res += tmp;
        } else {
            res += tmp;
        }
        for (int i = 1; i < s.length(); i++) {
            tmp = s.charAt(i);
            if (Character.isUpperCase(tmp)) {
                tmp += 32;
            }
            res += tmp;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String k = sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()) {
                System.out.print(xl(st.nextToken()) + " ");
            }
            System.out.println();
        }
    }
}
