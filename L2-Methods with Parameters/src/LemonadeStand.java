import javax.swing.*;
import java.text.DecimalFormat;

public class LemonadeStand {

    public static double price16 = 0.50;
    public static double price20 = 0.99;
    public static double tax = 7.5;


    /*
        You run a very successful Lemonade Stand.

        You sell 16 oz. cups of lemonade for $0.50 and
        20 oz. cups of lemonade for $0.99.

        You also have to report your income to the IRS,
        so you include a 7.5% sales tax on all purchases.

        Create a program which will ask the number of 16oz and 20oz cups of lemonade and display the total cost with tax.

        Your program should include at least ONE method with two parameters.

     */

    public static void main(String[] args) {

        int smallCupAmount = Integer.parseInt(JOptionPane.showInputDialog("how many 16 oz did you get?"));
        int bigCupAmount = Integer.parseInt(JOptionPane.showInputDialog("how many 20 oz did you get?"));

        Cost(smallCupAmount,bigCupAmount);

    }


    public static void Cost(int smallCupAmount,int bigCupAmount){

        DecimalFormat round = new DecimalFormat("$#,###.00");

        double cost16 = smallCupAmount * price16;

        double cost20 = bigCupAmount * price20;

        double totalCost = (cost16 + cost20) * (1 + tax/100.0);

        String message = "Your order: ";
        message += "\nnumber of 16 oz: " + smallCupAmount;
        message+= "\nnumber of 20 oz: " + bigCupAmount;
        message += "\nYour total is: " + round.format(totalCost);

        JOptionPane.showMessageDialog(null, message);

    }

}
