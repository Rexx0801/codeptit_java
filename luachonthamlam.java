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
public class luachonthamlam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        if (9 * n < s || (s == 0 && n > 1)) {
            System.out.println("-1 -1");
        } else {
            int x1[] = new int[101];
            int x2[] = new int[101];
            int sum = s;
            for (int i = 0; i < n; i++) {
                if (sum >= 9) {
                    x1[i] = 9;
                    sum -= 9;
                } else {
                    x1[i] = sum;
                    sum = 0;
                }
            }
            sum = s;
            for (int i = n - 1; i > 0; i--) {
                if (sum > 9) {
                    x2[i] = 9;
                    sum -= 9;
                } else {
                    if (sum != 1) {
                        x2[i] = sum - 1;
                        sum = 1;
                    } else {
                        x2[i] = 0;
                    }
                }
            }
            x2[0] = sum;
            for (int i = 0; i < n; i++) {
                System.out.print(x2[i]);
            }
            System.out.print(" ");
            for (int i = 0; i < n; i++) {
                System.out.print(x1[i]);
            }
            System.out.println();
        }
    }
}
