import java.util.Scanner;

public class IT24104388Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the number of new members introduced
        System.out.print("Enter the number of new members introduced: ");
        int members = scanner.nextInt();
        
        // Validate the input
        if (members < 0) {
            System.out.println("Bad Input: must be a number 0 or greater.");
        } else {
            // Determine the prize using a switch statement
            String prize;
            switch (members) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }
            
            // Display the prize
            System.out.println("Prize is a: " + prize);
        }
        
        scanner.close();
    }
}

