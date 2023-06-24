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
public class souuthe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int l = 0, c = 0;
            int check = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                    check = 1;
                } else {
                    if ((s.charAt(i) - '0') % 2 == 0) {
                        c++;
                    } else {
                        l++;
                    }
                }
            }
            if (check == 1) {
                System.out.println("INVALID");
            } else {
                if (l == c) {
                    System.out.println("NO");
                } else {
                    if ((l > c && s.length() % 2 == 1) || (l < c && s.length() % 2 == 0)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
