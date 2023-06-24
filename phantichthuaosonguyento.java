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
public class phantichthuaosonguyento {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            System.out.print("Test "+(i+1)+": ");
            for(int j=2;j<=n;j++){
                int dem=0;
                while(n%j==0){
                    dem++;
                    n/=j;
                }
                if(dem>0){
                    System.out.print(j+"("+dem+")"+" ");
                }
            }
            System.out.println("");
        }
    }
}
