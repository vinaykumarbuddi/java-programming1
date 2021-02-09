import java.util.Scanner;
public class Experiment13_Exceptionhandling{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a,b;
    try{
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println(a/b);
    }
    catch(Exception e){
      System.out.println(e+" occoured");
    }
    finally{
      System.out.println("ended");
    }
  }
}
