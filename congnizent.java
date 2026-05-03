import java.util.Scanner;
class congnizent {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of Pizza=");
    int pizza=sc.nextInt();
    System.out.print("Enter the number of Burger=");
    int burger=sc.nextInt();
    System.out.print("Enter the number of CoolDrinks=");
    int coolDrinks=sc.nextInt();

    int PizzaTotal=pizza*100;
    int BurgerTotal=burger*50;
    int CoolDrinksTotal=coolDrinks*10;

    int TotalPrizes=PizzaTotal+BurgerTotal+CoolDrinksTotal;

    System.out.print("Bill Details");
    System.out.print("\nNo. of Pizza:"+pizza);
    System.out.print("\nNo. of Burger:"+burger);
    System.out.print("\nNo. of CoolDrinks:"+coolDrinks);
    System.out.println("Total Prize="+TotalPrizes);
    }
}    