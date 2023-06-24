package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class chuanHoaVaSapXep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DANHSACH.in"));
        ArrayList<String> arr=new ArrayList<>();        
        while(sc.hasNextLine()){
            String[] s=sc.nextLine().trim().split("\\s+");
            String res="";
            for(int i=0;i<s.length;i++){
                res+=Character.toUpperCase(s[i].charAt(0));
                for(int j=1;j<s[i].length();j++) {
                    res+=Character.toLowerCase(s[i].charAt(j));
                }
                if(i!=s.length-1) res+=" ";
            }
            arr.add(res);
        }
        
        Collections.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                String[] s1=o1.split("\\s+");
                String[] s2=o2.split("\\s+");
                String res1=s1[s1.length-1]+s1[0];
                String res2=s2[s2.length-1]+s2[0];
                for(int i=1;i<s1.length-1;i++) res1+=s1[i];
                for(int i=1;i<s2.length-1;i++) res2+=s2[i];
                return res1.compareTo(res2);
            }
            
        });
        for(String x:arr){
            System.out.println(x);
        }
    }
}