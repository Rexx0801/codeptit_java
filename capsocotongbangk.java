/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author GearNB Shop PC
 */
public class capsocotongbangk {

    public static int first(int[] a, int i, int n, int key) {
        int res = -1;
        int l = i + 1;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == key) {
                res = m;
                r = m - 1;
            } else {
                if (a[m] > key) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }
        return res;
    }

    public static int last(int[] a, int i, int n, int key) {
        int res = -1;
        int l = i + 1;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == key) {
                res = m;
                l = m + 1;
            } else {
                if (a[m] > key) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long ans = 0;
            for (int i = 0; i < n - 1; i++) {
                if (last(a, i, n, k - a[i]) != -1) {
                    ans += last(a, i, n, k - a[i]) - first(a, i, n, k - a[i]) + 1;
                }
            }
            System.out.println(ans);
        }
    }
}
