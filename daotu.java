import java.util.Scanner;

public class daotu {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	sc.nextLine();
	while(t-->0)
	{
		String s=sc.nextLine();
		String a[]=s.split("\\s+");
		for(int i=0;i<a.length;i++)
		{
			StringBuilder sb=new StringBuilder(a[i]);
			System.out.print(sb.reverse().toString());
			if(i!=a.length-1) System.out.print(" ");
		}
		System.out.println();
	}
}
}
