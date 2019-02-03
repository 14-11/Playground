import java.util.Scanner;
class Main{
  public static int sum(int num)
  {
   int add=0;
    for(int i=1;i<=num;i++)
    
     add=add+i;
    
    return add;
  }
      
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int sod=sum(n);
      System.out.println(sod);
	}
}