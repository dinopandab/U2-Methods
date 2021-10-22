import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {
        //create and run the program

        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius?"));

        area(radius);
        circumference(radius);

    }
    public static void area(double radius){

        DecimalFormat round = new DecimalFormat("#.##");

        double area = Math.pow(radius,2) * Math.PI;

        JOptionPane.showMessageDialog(null, "Your area is: " + round.format(area));

    }

    public static void circumference(double radius){

        DecimalFormat round = new DecimalFormat("#.##");

        double circumference = radius * Math.PI * 2;

        JOptionPane.showMessageDialog(null, "Your circumference is: " + round.format(circumference));

    }
    //re-write the method to calculate a circle's area using parameters


    //re-write the method to calculate a circle's perimeter using parameters

}
