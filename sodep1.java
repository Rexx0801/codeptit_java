import java.util.Scanner;

public class sodep1 {
	public static boolean check(String s)
	{
		for(int i=0;i<=s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i) || (s.charAt(i)-'0')%2!=0) return false; 
		}
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
