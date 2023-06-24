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
public class tinhsofibonacci {
    public static void fibo(int n){
        long[] a = new long[93];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<93;i++){
            a[i]=a[i-1]+a[i-2];
        }
        System.out.println(a[n]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            fibo(n);
        }
    }
}
