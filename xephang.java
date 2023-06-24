import java.util.Scanner;

public class xephang {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int[] a=new int[t],b=new int[t];
	for(int i=0;i<t;i++)
	{
		a[i]=sc.nextInt();
		b[i]=sc.nextInt();
	}
	for(int i=0;i<t-1;i++)
	{
		for(int j=i+1;j<t;j++)
		{
			if(a[i]>a[j])
			{
				int tmp=a[i];
				a[i]=a[j];
				a[j]=tmp;
				int res=b[i];
				b[i]=b[j];
				b[j]=res;
			}
		}
	}
	int res=a[0]+b[0];
	for(int i=1;i<t;i++)
	{
		if(res<a[i]) res=a[i]+b[i];
		else res+=b[i];
	}
	System.out.println(res);
}
}
