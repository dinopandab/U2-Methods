import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {

        //call the area method
        area();
        circumference();

        //call the circumference method

    }

    public static void area(){
        DecimalFormat round = new DecimalFormat("#.##");
        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius?"));

       double area = Math.pow(radius,2) * Math.PI;

        JOptionPane.showMessageDialog(null, "Your area is: " + round.format(area));


    }
    //write a method to calculate a circle's area
    public static void circumference(){

        DecimalFormat round = new DecimalFormat("#.##");

        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius?"));

        double circumference = radius * Math.PI * 2;

        JOptionPane.showMessageDialog(null, "Your circumference is: " + round.format(circumference));

    }

    //write a method to calculate a circle's circumference

}
