import java.util.Scanner;

public class IT24104388Lab5Q3 {
    public static void main(String[] args) {
        // Constants for room charges and discount rates
        final double ROOM_CHARGE_PER_DAY = 48000.0;
        final int DISCOUNT_3_4_DAYS = 10; // 10%
        final int DISCOUNT_5_OR_MORE_DAYS = 20; // 20%

        Scanner scanner = new Scanner(System.in);

        // Input the start and end dates
        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        // Validate dates
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            scanner.close();
            return;
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            scanner.close();
            return;
        }

        // Calculate the number of days reserved
        int daysReserved = endDate - startDate;

        // Determine the discount rate
        int discountRate = 0;
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = DISCOUNT_3_4_DAYS;
        } else if (daysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        // Calculate the total cost
        double totalCost = daysReserved * ROOM_CHARGE_PER_DAY;
        double discount = totalCost * discountRate / 100;
        double finalAmount = totalCost - discount;

        // Display the results
        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + finalAmount);

        scanner.close();
    }
}

