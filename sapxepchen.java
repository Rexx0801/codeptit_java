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
public class sapxepchen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Buoc 0: "+a[0]);
        for(int i=1;i<n;i++){
            int j=i-1;
            int k=a[i];
            while(j>=0&&a[j]>k){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=k;
            System.out.print("Buoc "+i+": ");
            for(int x=0;x<=i;x++){
                System.out.print(a[x]+" ");
            }
            System.out.println("");
        }
    }
}
