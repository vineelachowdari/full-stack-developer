import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter the year the employee joined the organization: ");
        int joinedYear = scanner.nextInt();

        int yearsOfService = currentYear - joinedYear;

        if (yearsOfService > 5) {
            System.out.println("Bonus: Rs. 5000/-");
        } else if (yearsOfService >= 3) {
            System.out.println("Bonus: Rs. 3000/-");
        } else {
            System.out.println("No bonus awarded.");
        }

        scanner.close();
    }
}