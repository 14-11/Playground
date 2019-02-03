import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		 Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int p=n%10;
      int q=n/100;
      int s=p+q;
      System.out.println(s);
      
	}
}