import java.util.Scanner;
import java.lang.Math;
public class quayphai {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		int n=sc.nextInt();
		long a[]=new long[n];
		long res=100000;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();
			res=Math.min(res, a[i]);
		}
		long ans=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=res)
			{
				ans++;
			}
			else break;
		}
		System.out.println(ans);
	}
}
}
