import java.util.*;
import java.lang.Math;
class prime extends Thread{
  public void run(){
    System.out.println("prime started");
  }
  public static ArrayList primes(){
    ArrayList p=new ArrayList();
    int pc=0;
    for(int i=2;i<=100000;i++){
      int c=0;
      for(int j=1;j<Math.sqrt(i);j++){
      if(i%j==0)
      c+=1;}
      if(c==1){
      p.add(i);
//      System.out.println("prime:"+i);
      pc+=1;
    }
    }
    //System.out.println(pc);
    return p;
  }
}
class fib extends Thread{
    public void run(){
      System.out.println("fibonacci started");
    }
    public static ArrayList fibs(){
      ArrayList f=new ArrayList();
      int a=0,b=1,c=0;
      f.add(a);
      f.add(b);
      while(c<100000){
        c=a+b;
        //System.out.println("fib:"+c);
        f.add(c);
        a=b;
        b=c;
      }
      return f;
    }
}
public class Experiment14_primefib{
  public static void main(String args[]){
    prime p=new prime();
    fib f=new fib();
    p.start();
    f.start();
    ArrayList pr=p.primes();
    ArrayList fib=f.fibs();
    Iterator itr=pr.iterator();
    //System.out.println(pr.contains(34));
    while(itr.hasNext()){
      Integer i=(Integer)itr.next();
      if(fib.contains(i))
      System.out.println(i);
    }
  }
}
