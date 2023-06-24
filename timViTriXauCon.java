package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class timViTriXauCon {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("STRING.in"));
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            for(int j=0;j<=s1.length()-s2.length();j++){
                if(s2.equals(s1.substring(j, j+s2.length()))){
                    System.out.print((j+1)+" ");
                }
            }
            System.out.println();
        }
    }
}
