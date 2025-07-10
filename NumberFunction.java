import java.util.Scanner;

public class NumberFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arithmetic Section
        System.out.println("== Arithmetic Operations ==");
        System.out.print("Enter first value: ");
        int num1 = input.nextInt();
        System.out.print("Enter second value: ");
        int num2 = input.nextInt();
        performArithmetic(num1, num2);

        // Reverse and Palindrome Section
        System.out.println("\n== Reverse & Palindrome Check ==");
        System.out.print("Enter a number: ");
        int original = input.nextInt();
        int revNum = getReverse(original);
        System.out.println("Reversed value: " + revNum);
        System.out.println("Is Palindrome? " + (checkPalindrome(original) ? "Yes" : "No"));

        // Swap Section
        System.out.println("\n== Swapping Two Numbers ==");
        System.out.print("Enter first value to swap: ");
        int first = input.nextInt();
        System.out.print("Enter second value to swap: ");
        int second = input.nextInt();
        swapAndDisplay(first, second);
    }

    // Arithmetic method
    static void performArithmetic(int x, int y) {
        System.out.println("Sum: " + (x + y));
        System.out.println("Difference: " + (x - y));
        System.out.println("Product: " + (x * y));
        System.out.println("Quotient: " + (y != 0 ? (x / y) : "Undefined (division by zero)"));
    }

    // Reverse a number method
    static int getReverse(int number) {
        int result = 0;
        while (number > 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        return result;
    }

    // Palindrome check method
    static boolean checkPalindrome(int value) {
        return value == getReverse(value);
    }

    // Swap method
    static void swapAndDisplay(int val1, int val2) {
        System.out.println("Original values -> val1: " + val1 + ", val2: " + val2);
        val1 = val1 + val2;
        val2 = val1 - val2;
        val1 = val1 - val2;
        System.out.println("Swapped values  -> val1: " + val1 + ", val2: " + val2);
    }
}
