import java.util.Scanner;

public class ATM {
    USER_BANK bank;
    ATM(USER_BANK bank) {
        this.bank = bank;
    }
    Scanner sc = new Scanner(System.in);

    void display_menu() {
        System.out.println("Welcome to the ATM");
        System.out.println("1.Check Balance\n2.Deposit\n3.Withdraw\n4.Close");
    }

    public void start() {
        display_menu();
        int ch;
        while (true) {
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    bank.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount you want to deposit");
                    double amount = sc.nextDouble();
                    bank.deposit(amount);
                    break;
                case 3:if(bank.balance>0) {
                    System.out.println("Enter the amount you want to withdraw");
                    amount = sc.nextDouble();
                    bank.withdraw(amount);
                }else{
                    System.out.println("Insuficient funds!");
                }
                    break;
                case 4:
                    System.out.println("Thank you for choosing us!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

    }
}





