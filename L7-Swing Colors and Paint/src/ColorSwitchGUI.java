import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    JFrame window = new JFrame("color changer");
    JPanel panel = new JPanel();
    JButton button1 = new JButton("cute theme");
    JButton button2 = new JButton ("warm theme");
    JButton button3 = new JButton("cool theme");


    //Declare your frame, panel and three buttons.
    public ColorSwitchGUI(){
        //create your GUI

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 327);
        window.setLocationRelativeTo(null);

        //ADD ACTION LISTENER TO BUTTONS
        button1.addActionListener(new ColorSwitchGUI.button1Listener());
        button2.addActionListener(new ColorSwitchGUI.button2Listener());
        button3.addActionListener(new ColorSwitchGUI.button3Listener());

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        window.add(panel);
        window.setVisible(true);
        
    }

    //add listeners to change the colors. Don't forget to link them to buttons.

    private class button1Listener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            Color panelBack1 = new Color(255, 180, 180);
            Color buttonBack1 = new Color(42, 155, 155);
            Color buttonFront1 = new Color(186, 245, 253);

            panel.setBackground(panelBack1);
            button1.setBackground(buttonFront1);
            button1.setForeground(buttonBack1);
            button2.setForeground(buttonFront1);
            button2.setBackground(buttonBack1);
            button3.setForeground(buttonFront1);
            button3.setBackground(buttonBack1);

        }

    }
    private class button2Listener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            Color panelBack2 = new Color (255, 255, 76);
            Color buttonBack2 = new Color (225, 150, 113);
            Color buttonFront2 = new Color(248, 223, 213);

            panel.setBackground(panelBack2);
            button1.setBackground(buttonFront2);
            button1.setForeground(buttonBack2);
            button2.setBackground(buttonFront2);
            button2.setForeground(buttonBack2);
            button3.setForeground(buttonFront2);
            button3.setBackground(buttonBack2);

        }
    }
    private class button3Listener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            Color panelBack3 = new Color(112, 160, 243);
            Color buttonBack3 = new Color (70, 185, 76);
            Color buttonFront3 = new Color(195, 250, 184);


            panel.setBackground(panelBack3);
            button1.setBackground(buttonFront3);
            button1.setForeground(buttonBack3);
            button2.setBackground(buttonFront3);
            button2.setForeground(buttonBack3);
            button3.setBackground(buttonFront3);
            button3.setForeground(buttonBack3);


        }

    }




}
