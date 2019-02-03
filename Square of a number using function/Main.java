import java.util.Scanner;
class Main
{
  public static int sum(int num)
  {
    return num*num;
  }

	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int sod=sum(n);
      System.out.println(sod);
    } 
}