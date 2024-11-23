public class IT24104388Lab2Q3 {
    public static void main(String[] args) {
        // Given sides of the right triangle
        double sideA = 3.0;
        double sideB = 4.0;

        // Calculate the length of the hypotenuse using the Pythagorean theorem
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

        // Display the result
        System.out.println("Length of the hypotenuse: " + hypotenuse);
    }
}
