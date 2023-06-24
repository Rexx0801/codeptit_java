import java.util.Scanner;

public class matrannhiphan {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[][]=new int[n][3];
	int ans=0;
	for(int i=0;i<n;i++)
	{
		int tmp=0;
		for(int j=0;j<3;j++)
		{
			a[i][j]=sc.nextInt();
			tmp+=a[i][j];
		}
		if(tmp>=2) ans++;
	}
	System.out.println(ans);
}
}
