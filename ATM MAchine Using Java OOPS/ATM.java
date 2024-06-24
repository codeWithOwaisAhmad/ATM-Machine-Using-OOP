import java.util.Scanner;

public class ATM {
    float balance;
    int PIN = 1234;
    public void checkBalance(){
        System.out.println("Balance: "+ balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter the Withdraw Amount: ");
        Scanner scanner = new Scanner(System.in);
        float withdrawAmount = scanner.nextFloat();
        if (withdrawAmount > balance){
            System.out.println("Insufficient Balance");
        }
        else {
            balance = balance - withdrawAmount;
            System.out.println("Money Withdrawl Successful");
            menu();
        }
    }
    public void depositMoney(){
        System.out.println("Enter the Deposit Amount: ");
        Scanner scanner = new Scanner(System.in);
        float depositAmount = scanner.nextFloat();
        balance = balance + depositAmount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
    public void menu(){
        System.out.println("Enter Your Choices: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if(option == 1){
            checkBalance();
        } else if (option == 2) {
            withdrawMoney();
        } else if (option == 3) {
            depositMoney();
        } else if (option == 4) {
            return;
        }
        else {
            System.out.println("Enter a Valid Choice");
        }
    }
    public void checkpin(){
        System.out.println("Enter your PIN: ");
        Scanner scanner = new Scanner(System.in);
        int enteredpin = scanner.nextInt();
        if(enteredpin == PIN){
            menu();
        }
        else {
            System.out.println("Enter a valid PIN");
            checkpin();
        }
    }
}
