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
public class solienke {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            int kt=0;
            while(n>9){
                long a=n%10;
                n/=10;
                if(Math.abs(a-n%10)!=1){
                    kt=1;
                    break;
                }
            }
            if(kt==1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
