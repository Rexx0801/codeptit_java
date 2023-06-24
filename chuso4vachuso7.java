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
public class chuso4vachuso7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        int dem=0;
        while(n!=0){
            if(n%10==4||n%10==7) dem++;
            n/=10;
        }
        if(dem==4||dem==7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
