import java.util.ArrayList;
import java.util.Scanner;

public class thugondayso {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	ArrayList<Integer> b=new ArrayList<>();
	for(int i=0;i<n;i++) a[i]=sc.nextInt();
	b.add(a[0]);
	for(int i=1;i<n;i++)
	{
		if(b.size()==0) b.add(a[i]);
		else
		{
			if((a[i]+b.get(b.size()-1))%2==0) b.remove(b.size()-1);
			else b.add(a[i]);
		}
	}
	System.out.println(b.size());
}
}
