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
public class giaocua2dayso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int[] n = new int[a], m = new int[b];
        long[] check1 = new long[1001];
        long[] check2 = new long[1001];
        for (int i = 0; i < a; i++) {
            n[i] = sc.nextInt();
            check1[n[i]]++;
        }
        for (int i = 0; i < b; i++) {
            m[i] = sc.nextInt();
            check2[m[i]]++;
        }
        for (int i = 0; i < 1001; i++) {
            if (check1[i] != 0 && check2[i] != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
