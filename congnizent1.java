import java.util.Scanner;
class congnizent1 {
public static void palindrome(int number){
    Scanner sc = new Scanner(System.in);

    System.out.print("Goutam says a number = ");
    number = sc.nextInt();
    int count=0;
    int palo=number;
    if(number>-1){
        while(number>0){
        int reminder=number%10;
        count=count*10+reminder;
        number=number/10;
        }
        if(palo==count){
            System.out.print("Palindrome");
        }else{
            System.out.print("Not a Palindrome");
        }
    }else{
        System.out.print("Number invaild");
    }
    
  }
  public static void main(String[]args){
     int givennumber=0;
    
     palindrome(givennumber);
  }  
}
