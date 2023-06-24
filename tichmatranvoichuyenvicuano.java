import java.util.Scanner;

public class tichmatranvoichuyenvicuano {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int k=1;k<=t;k++)
	{
		int n=sc.nextInt(),m=sc.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[m][n];
		int c[][]=new int [n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
				b[j][i]=a[i][j];
			}
		}
		System.out.println("Test "+k+":");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int x=0;x<m;x++)
				{
					c[i][j]+=a[i][x]*b[x][j];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) System.out.print(c[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	}
}
}
