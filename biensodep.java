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
public class biensodep {

    public static boolean rise(String s) {
        if (s.charAt(5) >= s.charAt(6)) {
            return false;
        }
        if (s.charAt(6) >= s.charAt(7)) {
            return false;
        }
        if (s.charAt(7) >= s.charAt(9)) {
            return false;
        }
        if (s.charAt(9) >= s.charAt(10)) {
            return false;
        }
        return true;
    }

    public static boolean equal(String s) {
        if (s.charAt(5) != s.charAt(6)) {
            return false;
        }
        if (s.charAt(6) != s.charAt(7)) {
            return false;
        }
        if (s.charAt(7) != s.charAt(9)) {
            return false;
        }
        if (s.charAt(9) != s.charAt(10)) {
            return false;
        }
        return true;
    }

    public static boolean equal2(String s) {
        if (s.charAt(5) != s.charAt(6)) {
            return false;
        }
        if (s.charAt(6) != s.charAt(7)) {
            return false;
        }
        if (s.charAt(9) != s.charAt(10)) {
            return false;
        }
        return true;
    }

    public static boolean sau8(String s) {
        if (s.charAt(5) != '6' && s.charAt(5) != '8') {
            return false;
        }
        if (s.charAt(6) != '6' && s.charAt(6) != '8') {
            return false;
        }
        if (s.charAt(7) != '6' && s.charAt(7) != '8') {
            return false;
        }
        if (s.charAt(9) != '6' && s.charAt(9) != '8') {
            return false;
        }
        if (s.charAt(10) != '6' && s.charAt(10) != '8') {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (rise(s) == false && equal(s) == false && equal2(s) == false && sau8(s) == false) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
