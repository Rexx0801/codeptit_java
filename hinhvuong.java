/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author GearNB Shop PC
 */
public class hinhvuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), a1 = sc.nextInt(), b1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt(), a2 = sc.nextInt(), b2 = sc.nextInt();
        int res1 = Math.max(a1, a2) - Math.min(x1, x2);
        int res2 = Math.max(b1, b2) - Math.min(y1, y2);
        System.out.println(Math.max(res2, res1) * Math.max(res2, res1));
    }
}
