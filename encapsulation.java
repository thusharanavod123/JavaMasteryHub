package oop;

public class encapsulation {
    
    class BankAccount {
        private String owner;
        private double balance;
    
        public BankAccount(String owner, double balance) {
            this.owner = owner;
            this.balance = balance;
        }
    
        public String getOwner() {
            return owner;
        }
    
        public double getBalance() {
            return balance;
        }
    
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            }
        }
    
        public void withdraw(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient funds!");
            }
        }
    }
    
    public class encapsulation {
        public static void main(String[] args) {
            BankAccount account = new BankAccount("John Doe", 5000);
            System.out.println("Owner: " + account.getOwner());
            System.out.println("Balance: " + account.getBalance());
            account.deposit(1500);
            account.withdraw(3000);
        }
    }
    



}
