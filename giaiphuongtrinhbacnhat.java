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
public class giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        if(a==0&&b!=0){
            System.out.println("VN");
        }else if(a==0&&b==0){
            System.out.println("VSN");
        }else{
            System.out.printf("%.2f",(float)-b/a);
        }
    }
}
