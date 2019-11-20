import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class code extends Applet implements MouseListener,MouseMotionListener
{
    String msg="";  //Message printed
    int mouseX=0;   //Coordinates of the mouse
    int mouseY=0;   //Coordinates of the mouse
    

    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent obj)
    {
        mouseX=0;
        mouseY=10;
        msg="Mouse Clicked";
        repaint();
    }
    public void mouseExited(MouseEvent obj)
    {
        mouseX=0;
        mouseY=10;
        msg="Mouse Exited";
        repaint();
    }
    public void mousePressed(MouseEvent obj)
    {
        mouseX=obj.getX();
        mouseY=obj.getY();
        msg="Mouse Pressed";
        repaint();
    }
    public void mouseReleased(MouseEvent obj)
    {
        mouseX=obj.getX();
        mouseY=obj.getY();
        msg="Mouse Released";
        repaint();
    }
    public void mouseDragged(MouseEvent obj)
    {
        mouseX=obj.getX();
        mouseY=obj.getY();
        msg="Mouse Downed";
        repaint();
    }
    public void mouseEntered(MouseEvent obj)
    {   
        mouseX=0;
        mouseY=10;
        msg="Mouse Entered";
        repaint();
        
    }
    public void mouseMoved(MouseEvent obj)
    {
        mouseX=obj.getX();
        mouseY=obj.getY();
        showStatus("Mouse moving at" + obj.getX()+" , "+obj.getY());
    }
    public void paint(Graphics g)
    {
        g.drawString(msg, mouseX, mouseY);
    }
}