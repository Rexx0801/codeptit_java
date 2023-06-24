import java.util.Scanner;

public class lietketohop1{
public static int dem=0;
 public static void result(int a[], int k) {
        for (int i = 1; i <= k; i++) {
               System.out.print(a[i]+" ");
        }
        dem++;
        System.out.println();
 }

 public static void try_backTrack(int a[], int n, int k, int i) {
        for (int j = a[i - 1] + 1; j <= (n - k + i); j++) {
               a[i] = j;
               if (i == k)
                     result(a, k);
               else
                     try_backTrack(a, n, k, i + 1);
        }
 }

 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array = new int[n + 1];
        int k=sc.nextInt();
        try_backTrack(array, n, k, 1);
        System.out.println("Tong cong co "+dem+" to hop");
 }

}
