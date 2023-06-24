import java.util.Scanner;

public class soxacach {
	public static int a[]=new int[20],check[]=new int[20];
	public static int n;
	public static void in()
	{
		for(int i=2;i<=n;i++)
		{
			if(Math.abs(a[i]-a[i-1])==1) return;
		}
		for(int i=1;i<=n;i++) System.out.print(a[i]);
		System.out.println();
	}
	public static void Try(int i)
	{
		for(int j=1;j<=n;j++)
		{
			if(check[j]==0)
			{
				a[i]=j;
				check[j]=1;
				if(i==n) in();
				else
				{
					Try(i+1);
				}
				check[j]=0;
			}	
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		n=sc.nextInt();
		Try(1);
	}
	
}
}
