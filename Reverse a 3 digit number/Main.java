import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
     int n=in.nextInt();
    int frst=n/100;
    int scnd=((n/10)%10);
    int third=n%10;
    int rev=(third*100+scnd*10+frst);
    System.out.println(rev);
  }
}