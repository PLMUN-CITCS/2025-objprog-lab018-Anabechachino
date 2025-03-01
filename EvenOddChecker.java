import java.util.Scanner;

public class EvenOddChecker {
    
    public static void main(String[] args) {
        int number = getInput(); // Get user input
        boolean isEven = checkEvenOdd(number); // Check if even or odd
        displayResult(number, isEven); // Display result
    }
    
    // Method to get user input
    private static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }
    
    // Method to check if a number is even or odd
    private static boolean checkEvenOdd(int num) {
        return num % 2 == 0;
    }
    
    // Method to display the result
    private static void displayResult(int num, boolean isEven) {
        if (isEven) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
