import java.util.Scanner;
public class price {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        double salesTax = 1.05;
        double userPrice;
        double totalPrice;

        //input
        System.out.println("Please enter the price of your purchase.");
        userPrice = scan.nextDouble();

        //process
        totalPrice = userPrice * salesTax;

        //output
        System.out.println("The total price of your purchase with a 5% sales tax is $" + totalPrice + ".");

    }
}