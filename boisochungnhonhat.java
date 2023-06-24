/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class boisochungnhonhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String x = sc.next();
            String y = sc.next();
            BigInteger A = new BigInteger(x);
            BigInteger B = new BigInteger(y);
            BigInteger uc = A.gcd(B);
            BigInteger nhan = A.multiply(B);
            BigInteger lcm = nhan.divide(uc);
            System.out.println(lcm);
        }
    }
}
