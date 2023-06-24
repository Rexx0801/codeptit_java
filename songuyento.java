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
public class songuyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            int dem=0;
            for(int j=2;j<=Math.sqrt(n);j++){
                if(n%j==0){
                    dem=1;
                }
            }
            if(dem==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
