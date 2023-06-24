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
public class catdoi {
    private static String Convert(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '0' || c == '8' || c == '9') ans += '0';
            else if(c == '1') ans += '1';
            else return "INVALID";
        }
        int i = 0;
        while(i < s.length()&& ans.charAt(i) == '0'){
            i++;
        }
        if(i == s.length()) return "INVALID";
        return ans.substring(i);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(Convert(s));
        }
    }
}
