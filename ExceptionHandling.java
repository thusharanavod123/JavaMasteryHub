
public static void main(String[] args) {
    // Step 1: Basic try-catch block
    try {
        int result = 10 / 0; // This will cause an ArithmeticException
    } catch (ArithmeticException e) {
        System.out.println("ArithmeticException caught: Division by zero is not allowed.");
    }

    // Step 2: Multiple catch blocks
    try {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]); // This will cause an ArrayIndexOutOfBoundsException
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException caught: Index out of bounds.");
    } catch (Exception e) {
        System.out.println("General exception caught.");
    }

    // Step 3: Finally block
    try {
        int result = 10 / 2;
        System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
        System.out.println("ArithmeticException caught.");
    } finally {
        System.out.println("Finally block executed.");
    }

    // Step 4: Throwing exceptions
    try {
        checkAge(15); // This will cause an IllegalArgumentException
    } catch (IllegalArgumentException e) {
        System.out.println("IllegalArgumentException caught: " + e.getMessage());
    }
}

public static void checkAge(int age) {
    if (age < 18) {
        throw new IllegalArgumentException("Age must be 18 or older.");
    } else {
        System.out.println("Age is valid.");
    }
}