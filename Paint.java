import javax.swing.*;
import java.awt.*;

public class Paint extends JComponent {
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.drawLine(50, 300, 200, 300);
        g.drawLine(50, 150, 200, 150);
        g.drawLine(50, 150, 50, 300);
        g.drawLine(200, 150, 200, 300);
        g.drawLine(25,300,425,300);

        g.drawLine(25, 175, 125, 75);
        g.drawLine(225, 175, 125, 75);

        g.drawLine(150, 100, 150, 75);
        g.drawLine(150, 75,175,75);
        g.drawLine(175,75,175,125);

        g.drawLine(75,250,75,200);
        g.drawLine(75,200,125,200);
        g.drawLine(125,200,125,250);
        g.drawLine(125,250, 75,250);

        g.setColor(Color.GREEN);
        g.drawLine((int) 337.5,300, (int) 337.5,250);
        g.drawLine((int) 362.5,300, (int) 362.5,250);
        g.drawArc(275,50,150,200, (int) 279,341);

    }

    public static void main(String[] args){
        JFrame frame=new JFrame("My drawing");
        Paint draw=new Paint();
        draw.setSize(500,400);
        frame.setSize(450, 300);
        frame.add(draw);
        frame.pack();
        frame.setVisible(true);

    }

}
