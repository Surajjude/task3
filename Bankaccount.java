
import java.util.Scanner;

class Atm {

    public float balance;
    private float ammount;

    Scanner m = new Scanner(System.in);

    public void Enter() {
        System.out.println("Enter 1 to Check balance");
        System.out.println("Enter 2 to Deposite money");
        System.out.println("Enter 3 to Widthraw money");
        System.out.println("Enter 4 to Exit");

        int choice;
        choice = m.nextInt();
        // 1 System.out.println("Enter your choice"+choice);
        switch (choice) {
            case 1:
                checkBalance();
                Enter();
                break;
            case 2:
                Deposite();
                Enter();
                break;
            case 3:
                Widthraw();
                Enter();
                break;
            case 4:
                Exit();
                break;
        }

    }

    public void checkBalance() {
        System.out.println("your balance is:- " + balance);
    }

    public void Widthraw() {
        System.out.println("Enter the money you want widhdraw");
        ammount = m.nextFloat();
        if (ammount <= balance) {

            balance = balance - ammount;
        } else {
            System.out.println("Your balance is not sufficient");
        }
    }

    public void Deposite() {
        System.out.println("Enter the money you want to deposite");
        ammount = m.nextFloat();
        balance = balance + ammount;
    }

    public void Exit() {
        System.out.println("Thank you for visiting");
    }

}

public class Bankaccount extends Atm {

    public static void main(String[] args) {
        Bankaccount t = new Bankaccount();
        t.Enter();
    }

}