package oop.abstraction;

public abstract class ATM {
    public void welcome() {
        System.out.println("Welcome to the ATM of falano Bank");
    }

    public abstract void checkBalance();

    public abstract void depositMoney();
}

class MainLogic extends ATM {
    public void checkBalance() {
        System.out.println("Your Balance is Rs.00");
    }

    public void depositMoney() {
        System.out.println("You Deposited money!");
    }

    public static void main(String[] args) {
        MainLogic m = new MainLogic();
        m.welcome();
        m.checkBalance();
        m.depositMoney();
    }
}
