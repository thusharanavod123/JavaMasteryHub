
public static void main(String[] args) {
    // Creating a string
    String greeting = "Hello, World!";
    
    // Printing the string
    System.out.println(greeting);
    
    // Getting the length of the string
    int length = greeting.length();
    System.out.println("Length: " + length);
    
    // Converting the string to uppercase
    String upperCaseGreeting = greeting.toUpperCase();
    System.out.println("Uppercase: " + upperCaseGreeting);
    
    // Checking if the string contains a substring
    boolean containsWorld = greeting.contains("World");
    System.out.println("Contains 'World': " + containsWorld);
    
    // Replacing a substring
    String replacedGreeting = greeting.replace("World", "Java");
    System.out.println("Replaced: " + replacedGreeting);
}