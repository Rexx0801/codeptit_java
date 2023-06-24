/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author GearNB Shop PC
 */
public class dayconcotongnguyento {

    public static int n, a[] = new int[15], c[] = new int[15];

    public static boolean is_prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void in() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] == 1) {
                sum += a[i];
            }
        }
        if (is_prime(sum)) {
            for (int i = 0; i < n; i++) {
                if (c[i] == 1) {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void Try(int i) {
        for (int j = 0; j <= 1; j++) {
            c[i] = j;
            if (i == n - 1) {
                in();
            } else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            ArrayList<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                b.add(x);
            }
            Collections.sort(b, new Comparator<Integer>() {

                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
            for (int i = 0; i < n; i++) {
                a[i] = b.get(n - i - 1);
            }
            Try(0);
        }
    }
}
