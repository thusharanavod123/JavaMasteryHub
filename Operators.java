public class Operators {
    
}
public static void main(String[] args) {
    int a = 10;
    int b = 5;

    // Arithmetic Operators
    System.out.println("a + b = " + (a + b)); // Addition
    System.out.println("a - b = " + (a - b)); // Subtraction
    System.out.println("a * b = " + (a * b)); // Multiplication
    System.out.println("a / b = " + (a / b)); // Division
    System.out.println("a % b = " + (a % b)); // Modulus

    // Relational Operators
    System.out.println("a == b: " + (a == b)); // Equal to
    System.out.println("a != b: " + (a != b)); // Not equal to
    System.out.println("a > b: " + (a > b)); // Greater than
    System.out.println("a < b: " + (a < b)); // Less than
    System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
    System.out.println("a <= b: " + (a <= b)); // Less than or equal to

    // Logical Operators
    boolean x = true;
    boolean y = false;
    System.out.println("x && y: " + (x && y)); // Logical AND
    System.out.println("x || y: " + (x || y)); // Logical OR
    System.out.println("!x: " + (!x)); // Logical NOT

    // Bitwise Operators
    System.out.println("a & b: " + (a & b)); // Bitwise AND
    System.out.println("a | b: " + (a | b)); // Bitwise OR
    System.out.println("a ^ b: " + (a ^ b)); // Bitwise XOR
    System.out.println("~a: " + (~a)); // Bitwise Complement
    System.out.println("a << 2: " + (a << 2)); // Left shift
    System.out.println("a >> 2: " + (a >> 2)); // Right shift
    System.out.println("a >>> 2: " + (a >>> 2)); // Unsigned right shift

    // Assignment Operators
    int c = 10;
    c += 5; // c = c + 5
    System.out.println("c += 5: " + c);
    c -= 5; // c = c - 5
    System.out.println("c -= 5: " + c);
    c *= 5; // c = c * 5
    System.out.println("c *= 5: " + c);
    c /= 5; // c = c / 5
    System.out.println("c /= 5: " + c);
    c %= 5; // c = c % 5
    System.out.println("c %= 5: " + c);

    // Unary Operators
    int d = 10;
    System.out.println("d++: " + (d++)); // Post-increment
    System.out.println("++d: " + (++d)); // Pre-increment
    System.out.println("d--: " + (d--)); // Post-decrement
    System.out.println("--d: " + (--d)); // Pre-decrement
}