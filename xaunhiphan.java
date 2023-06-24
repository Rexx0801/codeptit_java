/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author GearNB Shop PC
 */
public class xaunhiphan {

    public static long[] f = new long[93];

    public static void ktao() {
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 92; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
    }

    public static int solve(int n, long k) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (k <= f[n - 2]) {
            return solve(n - 2, k);
        }
        return solve(n - 1, k - f[n - 2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ktao();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(solve(n, k));
        }
    }
}
