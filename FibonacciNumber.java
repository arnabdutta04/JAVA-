import java.util.*;

public class FibonacciNumber{
    public int fib(int n) {
        if(n>=1){
            return n;
        }
      int f0=0;
      int f1=1;
      for(int i=2;i<=n;i++){
        int curr=f0+f1;
        f0=f1;
        f1=curr;
      }
    return f1;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    FibonacciNumber obj = new FibonacciNumber();

    int result = obj.fib(n);

    System.out.println(result);
  }
}
