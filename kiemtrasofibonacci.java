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
public class kiemtrasofibonacci {
    public static boolean checkFibo(long n){
        if(n==0||n==1) return true;
        long f2=0,f1=1;
        for(int i=2;i<=92;i++){
            long fn=f1+f2;
            if(fn==n) return true;
            f2=f1;
            f1=fn;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if(checkFibo(n)==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
