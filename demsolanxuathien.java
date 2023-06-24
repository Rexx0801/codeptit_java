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
public class demsolanxuathien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 1;
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[100001];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[a[i]]++;
            }
            System.out.println("Test " + x + ":");
            for (int i = 0; i < n; i++) {
                if (b[a[i]] != 0) {
                    System.out.println(a[i] + " xuat hien " + b[a[i]] + " lan");
                    b[a[i]] = 0;
                }
            }
            x++;
        }
    }
}
