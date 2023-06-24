/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GearNB Shop PC
 */
public class rutgonxaukitu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (sb.length() == 0) {
                sb.append(s.charAt(i));
            } else {
                if (sb.charAt(sb.length() - 1) == s.charAt(i)) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(s.charAt(i));
                }
            }
        }
        if (sb.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(sb);
        }
    }
}
