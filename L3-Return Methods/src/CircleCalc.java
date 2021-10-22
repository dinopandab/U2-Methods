import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {

    /*

    1. get the input - radius
    2.calculate area
    3.calculate circumference
    4.display results - output

    */

    public static void main(String[] args) {
        //1.
        double radius = getInput("what is the radius?");
        //2.
        double area = area(radius);
        //3.
        double circumference = circumference(radius);
        //4.way 1
        // JOptionPane.showInputDialog(null, displayResult(area , circumference));

        // way2
        outputResults(area,circumference);
    }

    //get Input
    public static double getInput(String prompt){
        return Double.parseDouble(JOptionPane.showInputDialog(prompt));
    }

    public static double area(double radius){
        return  Math.pow(radius, 2) * Math.PI;
    }

    public static double circumference(double radius){
        return radius * Math.PI * 2;
    }
    //way 1
    public static String displayResult(double area , double circumference){
        DecimalFormat round = new DecimalFormat("#.##");

        String message = "The area is: " + area;
        message += "\nthe circumference is: " + circumference;

        return message;
    }

    // way 2
    public static void outputResults(double area , double circumference){
        DecimalFormat round = new DecimalFormat("#.##");

        String message = "The area is: " + round.format(area);
        message += "\nthe circumference is: " + round.format(circumference);

        JOptionPane.showMessageDialog(null,message);

    }


}
