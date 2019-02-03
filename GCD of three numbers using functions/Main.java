import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   Scanner in= new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int result=gcd(n1,n2);
      System.out.println(gcd(n1,n2)); 
	}
  public static int gcd(int n1,int n2)
  {
    int min_no;
    if(n1<n2)
    {
      min_no=n1;
    }
    else
    {
      min_no=n2;
    }
    while(min_no>=1)
    {
      if((n1%min_no==0)&&(n2%min_no==0))
      {
        return min_no;
      }
      --min_no;
    }
    return 0;
  }
}