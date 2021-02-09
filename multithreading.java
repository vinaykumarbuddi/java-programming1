import java.lang.Thread;
import java.util.Random;
class square extends Thread{
  private static int number=0;
  public static void set(int n){
    number=n;
  }
  public void run(){
    System.out.printf("the square of %d is %d",number,number*number);
  }
}
class cube extends Thread{
  private static int number=0;
  public static void set(int n){
    number=n;
  }
  public void run(){
    System.out.printf("\nthe cube of %d is %d",number,number*number*number);
  }
}
public class Experiment15_multithreading{
  public static void main(String args[]){
    Random r=new Random();
    int n=r.nextInt(50);
    square s=new square();
    cube c=new cube();
    s.set(n);
    c.set(n);
    s.start();
    c.start();
    System.out.println("the end");
  }
}
