
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double loss;
        double profit;

        System.out.print("Enter the cost price of product ");
        double cost = scan.nextDouble();

        System.out.print("Enter the selling price of product ");
        double sell = scan.nextDouble();

        if (cost < sell) {
            profit = cost - sell;
            System.out.println("profit"+ profit);
        } else {
            loss =sell - cost;
            System.out.println("loss"+ loss);
        }
    }
}