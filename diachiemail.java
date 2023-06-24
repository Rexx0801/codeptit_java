
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class diachiemail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        while (t-- > 0) {
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            StringBuilder sb = new StringBuilder();
            ArrayList<String> a = new ArrayList<String>();
            while (st.hasMoreTokens()) {
                a.add(st.nextToken());
            }
            String res = a.get(a.size() - 1).toLowerCase();
            for (int i = 0; i < a.size() - 1; i++) {
                res += Character.toLowerCase(a.get(i).charAt(0));
            }
            if (map.containsKey(res)) {
                int x = map.get(res);
                x++;
                map.put(res, x);
            } else {
                map.put(res, 1);
            }
            if (map.get(res) == 1) {
                System.out.println(res + "@ptit.edu.vn");
            } else {
                System.out.println(res + map.get(res) + "@ptit.edu.vn");
            }
        }
    }
}
