public class IT24104388Lab2Q1 {
    public static void main(String[] args) {
        //perimeter
        double perimeter = 100.0;

        // Calculate length & width
        double length = perimeter / (2 * (1 + 0.75)); // width = 3/4 of length
        double width = 0.75 * length;

        //Display the results
        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}
