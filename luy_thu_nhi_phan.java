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
public class luy_thu_nhi_phan {
//    public static long luyThua(int a,int b){
//        long res=1;
//        for(int i=1;i<=b;i++){
//            res*=a;
//        }
//        return res;
//    }

//luy thua nhi phan
    public static long luyThua2(int a, int b) {
        //xet bit cuoi cung cua b
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                res *= a;
            }
            b /= 2;
            a *= a;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(luyThua2(a, b));
    }
}
