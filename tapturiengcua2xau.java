
import java.util.Scanner;
import java.util.TreeSet;

public class tapturiengcua2xau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = sc.nextLine();
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String a[] = s1.split("\\s+");
            TreeSet<String> ts1 = new TreeSet<>();
            for (int i = 0; i < a.length; i++) {
                ts1.add(a[i]);
            }
            String s2 = sc.nextLine();
            String b[] = s2.split("\\s+");
            TreeSet<String> ts2 = new TreeSet<>();
            for (int i = 0; i < b.length; i++) {
                ts2.add(b[i]);
            }
            for (String x : ts1) {
                if (ts2.contains(x) == false) {
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }
    }
}
