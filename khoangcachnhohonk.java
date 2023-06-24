/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author GearNB Shop PC
 */
public class khoangcachnhohonk {

    public static int find(int a[], int n, int i, int k) {
        int res = -1;
        int l = i + 1, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] - a[i] < k) {
                res = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long ans = 0;
            for (int i = 0; i < n - 1; i++) {
                if (find(a, n, i, k) != -1) {
                    ans += find(a, n, i, k) - i;
                }
            }
            System.out.println(ans);
        }
    }
}
