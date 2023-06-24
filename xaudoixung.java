import java.util.Scanner;

public class xaudoixung {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		String s=sc.next();
		int x=1;
		boolean check=true;
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				x--;
			}
		}
		if(x<0) check=false;
		if(x==1 && s.length()%2==0) check=false;
		if(check) System.out.println("YES");
		else  System.out.println("NO");
	}
}
}