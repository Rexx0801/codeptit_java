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
public class uocsontolonnhat {
    public static boolean soNguyenTo(long n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long res=0;
            for(int i=2;i<=Math.sqrt(n);i++){
                while(n%i==0){
                    n/=i;
                }
            }
            if(n!=1){
                res=n;
            }
            System.out.println(res);
        }
    }
}
