import java.util.Scanner;

public class dayuuthe {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	sc.nextLine();
	while(t-->0)
	{
		int c=0;
		int l=0;
		String s=sc.nextLine();
		String[] a=s.split("\\s+");
		for(int i=0;i<a.length;i++)
		{
			int x=Integer.parseInt(a[i]);
			if(x%2==0) c++;
			else l++;
		}
		if(a.length%2==0)
		{
			if(c>l) System.out.println("YES");
	        else System.out.println("NO");
		}
		else
		{
			if(c<l) System.out.println("YES");
	        else System.out.println("NO");
		}
	}
}
}