/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author GearNB Shop PC
 */
public class matranxoanoctangdan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[][] s = new int[n][n];
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                b.add(a[i][j]);
            }
        }
        Collections.sort(b);
        int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1, x = 0;
        while (x < b.size()) {
            for (int i = c1; i <= c2; i++) {
                s[h1][i] = b.get(x);
                x++;
            }
            h1++;
            for (int i = h1; i <= h2; i++) {
                s[i][c2] = b.get(x);
                x++;
            }
            c2--;
            for (int i = c2; i >= c1; i--) {
                s[h2][i] = b.get(x);
                x++;
            }
            h2--;
            for (int i = h2; i >= h1; i--) {
                s[i][c1] = b.get(x);
                x++;
            }
            c1++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
    }
}
