import java.util.Scanner;

public class TotalExpensesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses = quantity * pricePerItem;

        if (quantity > 50) {
            totalExpenses *= 0.9; // Apply 10% discount
        } else if (quantity >= 25) {
            totalExpenses *= 0.95; // Apply 5% discount
        }

        System.out.println("Total expenses: Rs. " + totalExpenses);

        scanner.close();
    }
}