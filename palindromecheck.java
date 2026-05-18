import java.util.Scanner;

class palindromecheck {
    public static void palindrome(int n){
        int temp=n;
        int rev=0;
      while(temp>0){
        rev=rev * 10 + temp % 10;
        temp/=10;
      }System.out.println(n==rev ? "yes" : "no");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        palindrome(n);
    }
}
