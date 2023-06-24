import java.util.Scanner;
import java.lang.Math;
public class bosungdayso {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	int[] b=new int[201];
	int res=0;
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		res=Math.max(res,a[i]);
		b[a[i]]++;
	}
	int check=1;
	for(int i=1;i<res;i++)
	{
		if(b[i]==0)
		{
			System.out.println(i);
			check=0;
		}
	}
	if(check==1)
	{
		System.out.println("Excellent!");
	}
}
}
