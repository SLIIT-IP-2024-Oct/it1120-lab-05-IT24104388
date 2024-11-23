public class IT24104388Lab2Q2 {
    public static void main(String[] args) {
        // Given data
        double sideLength = 10.0; // Side of the square
        double PI = 3.14; // Value of PI

        // Calculate the perimeter of the square
        double squarePerimeter = 4 * sideLength;
        double radius = squarePerimeter / (2 * PI);

        // Display the result
        System.out.println("Radius of the circular fence: " + radius);
    }
}
