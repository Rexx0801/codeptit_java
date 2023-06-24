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
public class Thuat_toan {
    
    //Sang so nguyen to
    public static boolean[] prime = new boolean[1000001];
    public static void sang(){
        for(int i=0;i<=1000000;i++) prime[i]=true;
        prime[0]=prime[1]=false;
        for(int i=2;i<=Math.sqrt(1000000);i++){
            if(prime[i]){
                for(int j=i*i;j<1000000;j+=i){
                    prime[j]=false;
                }
            }
        }
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        sang();
//        for(int i=1;i<=n;i++){
//            if(prime[i]) System.out.println(i);
//        }
//    }
}