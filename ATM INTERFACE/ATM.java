
import java.util.Scanner;

class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited:" + amount);
        } else {
            System.out.println("Invalid deposit amount.\nPlease enter a positive value.");
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn:" + amount);
            return true;
        } else if(amount > balance) {
            System.out.println("Insufficient balance.\nPlease try again.");
            return false;
        } else {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }
    }
    public double checkBalance() {
        return balance;
    }
}

public class ATM {

   
    private BankAccount bankAccount;
    public ATM(BankAccount account) {
        this.bankAccount = account;
    }
    public void displayMenu() {
        System.out.println("\n===== ATM Menu =====\n");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.println("\n====================\n");
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean exit=false;
        while(!exit){
            displayMenu();
            System.out.print("Choose an option:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current Balance:" + bankAccount.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount:");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount:");
                    double withdrawAmount = scanner.nextDouble();
                    bankAccount.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            System.out.print("Do you want to exit? (yes/no):");
            String exChoice = scanner.next();
            if(exChoice.equalsIgnoreCase("yes")){
                exit = true;
            }
        } 
        scanner.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial account balance: ");
        double accountBalance = sc.nextDouble();
        BankAccount account = new BankAccount(accountBalance);
        ATM atm = new ATM(account);
        atm.start();
        sc.close();
    
    }
    
}
