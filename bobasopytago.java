import java.util.Scanner;
import java.util.Arrays;
public class bobasopytago {
	public static boolean check(long a[],int n)
	{
		int i=n-1;
		while(i>=2)
		{
			int l=0;
			int r=i-1;
			while(l<r)
			{
				long key=a[l]+a[r];
				if(key==a[i]) return true;
				if(key<a[i]) l++;
				else r--;
			}
			i--;
		}
		return false;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int j=0;j<t;j++)
	{
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		{
			long x=sc.nextInt();
			a[i]=x*x;
		}
		Arrays.sort(a);
		if(check(a,n)) System.out.println("YES");
		else System.out.println("NO");
	}
}
}
