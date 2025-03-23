package oop;

public class solid_principles {
    
    class User {
        private String name;
        private String email;
    
        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }
    
        public String getEmail() {
            return email;
        }
    }
    
    class EmailService {
        public void sendEmail(User user, String message) {
            System.out.println("Sending email to: " + user.getEmail() + " | Message: " + message);
        }
    }
    
    public class solid_principles {
        public static void main(String[] args) {
            User user = new User("Alice", "alice@example.com");
            EmailService emailService = new EmailService();
            emailService.sendEmail(user, "Welcome to JavaMasteryHub!");
        }
    }
    // This is a simple Java program that demonstrates the Single Responsibility Principle (SRP)
    // in the context of a User class and an EmailService class.    


}
