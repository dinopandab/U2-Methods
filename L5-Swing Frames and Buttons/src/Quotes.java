import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
    public static void main(String[] args) {

        JFrame window = new JFrame("Quotes Window");
        JPanel panel = new JPanel ();
        JButton button1 = new JButton("Click for quote number one");
        JButton button2 = new JButton ("Click for quote two");
        JButton button3 = new JButton ("Click for quote three");

        window.setSize(350,100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button1.addActionListener(new quote1());
        button2.addActionListener(new quote2());
        button3.addActionListener(new quote3());

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        window.add(panel);
        window.setVisible(true);

    }


    private static class quote1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null, "quote by bill nye the science guy!");

        }
    }
        private static class quote2 implements ActionListener {

            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "quote 2!");

            }
        }
            private static class quote3 implements ActionListener {

                public void actionPerformed(ActionEvent e) {

                    JOptionPane.showMessageDialog(null, "quote 3!");

                }
            }



}
