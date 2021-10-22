import javax.swing.*;

public class BankAccount {

    //create a program which simulates a bank account

    /*write a method to simulate a deposit.
    Prompt the user to enter their balance and the deposit amount,
    then display the new balance. */


    /*write a method to simulate a withdrawal.
    Prompt the user to enter their balance the withdrawal amount,
    then display the new balance.
     */
    public static void main(String[] args) {
    deposit();
    withdraw();

    }

    public static void deposit(){
        double balance = Double.parseDouble(JOptionPane.showInputDialog("What is your current balance? "));
        double deposit = Double.parseDouble(JOptionPane.showInputDialog("what is your deposit? "));

        balance += deposit;

        JOptionPane.showMessageDialog(null, "Your new balance is: " + balance);

    }

    public static void withdraw(){
        double balance = Double.parseDouble(JOptionPane.showInputDialog("what is your deposit?"));
        double withdraw = (Double.parseDouble(JOptionPane.showInputDialog("What is your withdraw?")));

        balance -= withdraw;

        JOptionPane.showMessageDialog(null, "Your new balance is: " + withdraw);
    }

}
