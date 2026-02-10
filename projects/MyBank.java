package projects;

import java.util.Scanner;

public class MyBank {
    private long currentbalance = 10000;

    public void checkBalance() {
        System.out.println("\nYour Current Balance is Rs. " + currentbalance);
    }

    public void depositMoney(long money) {
        try {
            if (money > 0) {
                currentbalance += money;
                System.out
                        .println("\nRs. " + money + " has been deposited successfully. Your New balance is Rs. "
                                + currentbalance);
            } else {
                System.out.println("\nThe amount of money is to less, We cannot deposit this!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void withdrawMoney(long amount) {
        try {
            if (amount < currentbalance) {
                System.out
                        .println("\nYou withdrew Rs. " + amount + ". Your current balance is: "
                                + (currentbalance - amount));
                currentbalance -= amount;
            } else {
                System.out.println("\nYou have insufficient Balance!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        MyBank mb = new MyBank();
        while (choice != 4) {
            System.out.print("\n1. Deposit \n2. Withdraw \n3. Check Balance \n4. Exit \nChoose option: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nHow much Money do you want to deposit: ");
                    long money = sc.nextLong();
                    mb.depositMoney(money);
                    break;
                case 2:
                    System.out.println("\nHow much money do you want to withdraw: ");
                    money = sc.nextLong();
                    mb.withdrawMoney(money);
                    break;
                case 3:
                    mb.checkBalance();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nIncorrect Choice!!");
                    break;
            }
        }
        sc.close();
    }
}
