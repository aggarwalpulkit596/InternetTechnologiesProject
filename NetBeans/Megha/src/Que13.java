
import java.awt.*;
import java.applet.*;
/*<applet code="Que13" w=50 h=100>
</applet>
*/
public class Que13 extends Applet {
  
    public void init(){
            
    setBackground(Color.black);
    
}
public void paint(Graphics g)
{
    
    g.setColor(Color.GRAY);
            g.fillRect(10,15,20,25);
            g.setColor(Color.red);
            g.fillOval(35,15,20,20);
            g.setColor(Color.blue);
            g.fillOval(85,15,20,25);
            g.setColor(Color.magenta);
            g.drawArc(100,110,50,50,0,90);
            g.setColor(Color.cyan);
            int x[]={200,220,230,250,230,260,250,225};
            int y[]={200,220,225,220,210,190,160,140};
            g.fillPolygon(x,y,8);
}
}