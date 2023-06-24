
import java.util.Scanner;

public class danhdauchucai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a[] = new int[257];
        for (int i = 0; i < s.length(); i++) {
            a[(int) s.charAt(i)]++;
        }
        int ans = 0;
        for (int i = 0; i < 257; i++) {
            if (a[i] != 0) {
                ans++;
            }
        }
        System.out.println(ans);

    }
}
