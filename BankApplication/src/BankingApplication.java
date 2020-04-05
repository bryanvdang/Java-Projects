/**
 * Created by bvdang on 4/4/2020.
 */
public class BankingApplication {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    void deposit(int amount) { //takes in a variable/parameter called 'amount' to see how much is being deposited
        if(amount != 0) { //dont' perform action if amount is zero
            balance = balance + amount; //update the balance by adding the amount to it
            previousTransaction = amount; //set the previous transaction to amount
        }
    }

    void withdraw(int amount) { //pass in parameter so we know how much is being withdrawn
        if(amount != 0) { //set conditional because there is no point in withdrawing zero from the account
            balance = balance - amount;
            previousTransaction = -amount; //add the minus to indicate a withdraw
        }
    }

    void getPreviousTransaction() {
        if(previousTransaction > 0) { //amount is deposited
            System.out.println("Deposited: " + previousTransaction);
        }
        else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction)); //Without 'Math.absolute", the print would return ("withdrawn -1000). The library returns an absolute number
        }
        else {
            System.out.println("No Transaction has Occured");
        }
    }

    void showMenu() {

    }
}