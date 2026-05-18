import java.util.Scanner;
class primeNumber {
  public static void prime(int n){
    boolean isPrime=true;
    if(n<=1){
        isPrime=true;
    }else{
        for(int i=2 ;i<n;i++){
           if(n%i==0){
            isPrime=false;
            break;
            }
        }
    }
    if(isPrime){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not a prime");
        }
  }public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    prime(n);
  }    
}
