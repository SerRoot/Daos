import java.awt.*;
import java.applet.*;
public class Primitives extends Applet {
    public void paint (Graphics g) {
        g.fillRect(20, 20, 40, 60);
        g.setColor(Color.red);
        g.drawLine(2, 2, 80, 80);
        g.drawOval(120, 120, 30, 40);
        g.drawRect(170, 170, 10, 15);
        g.setColor(Color.blue);
        g.fillOval(20, 150, 30, 30);
    }
}
