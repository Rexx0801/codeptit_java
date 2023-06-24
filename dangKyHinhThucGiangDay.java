package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class dangKyHinhThucGiangDay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MONHOC.in"));
        ArrayList<String> arr=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String tmp=sc.nextLine()+" "+sc.nextLine()+" "+sc.nextLine()+" "+
                    sc.nextLine()+" ";
            String s=sc.nextLine();
            if(s.equals("Truc tiep")==false){
                arr.add(tmp+s);
            }
        }
        Collections.sort(arr);
        for(String x:arr){
            System.out.println(x);
        }
    }
}
