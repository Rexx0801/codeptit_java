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
public class tinhluythua {
    private static int MOD=(int) 1e9+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==0 && b==0) break;
            long c=1;
            while(b>0){
                if(b%2==1){
                    c=(c*a)%MOD;
                }
                a=(a*a)%MOD;
                b/=2;
            }
            System.out.println(c);
        }
    }
}
