import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    //DECLARE VARIABLES
    JFrame frame;

    public ArtworkGUI()
    {
        //CREATE THE GUI

        frame = new JFrame();
        frame.setSize(600,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();
        frame.add(panel);

        frame.setVisible(true);

    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            //Set the background color
            setBackground(new Color(98, 204, 204));
        }
        public void paintComponent (Graphics g){
            super.paintComponent(g);

            g.setColor(new Color(255, 90, 90));
            g.drawRect(100,400,200,200);
            g.fillRect(100,400,200,200);

            g.setColor(new Color(255, 255, 255));
            g.drawRect(120,450,50,50);
            g.fillRect(120,450,50,50);

            g.setColor(new Color(255, 255, 255));
            g.drawRect(230,450,50,50);
            g.fillRect(230,450,50,50);

            g.setColor(new Color(229, 102, 7));
            g.drawRect(185,500,30,70);
            g.fillRect(185,500,30,70);

            g.setColor(new Color(4, 224, 59));
            g.drawRect(1,570,1000,100);
            g.fillRect(1,570,1000,100);

            g.setColor(new Color(255, 215, 29));
            g.drawOval(20,20,80,80);
            g.fillOval(20,20,80,80);

            g.setColor(new Color(255, 82, 8));
            g.drawRect(85,370,230,30);
            g.fillRect(85,370,230,30);






        }
        //Add the PaintComponent Method and create your drawing.
    }
}
