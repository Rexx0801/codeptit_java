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
public class tonguocso1 {
    public static int kt(int n){
        int res=0;
        while(n%2==0){
            res+=2;
            n/=2;
	}
        for(int i=3;i<=Math.sqrt(n);i+=2){
            while(n%i==0){
                res+=i;
                n/=i;
            }
        }
        if(n!=1) res+=n;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum=0;
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            sum+=kt(n);
        }
        System.out.println(sum);
    }
}
