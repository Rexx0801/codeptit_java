import java.util.Scanner;

public class sodep2 {
	public static boolean check(String s)
	{
		if(s.charAt(0)!='8') return false;
		long sum=0;
		for(int i=0;i<s.length();i++)
		{
			sum+=(s.charAt(i)-'0');
		}
		if(sum%10!=0) return false;
		return true;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		String s=sc.next();
		if(check(s)==true) System.out.println("YES");
		else System.out.println("NO");
	}
}
}
