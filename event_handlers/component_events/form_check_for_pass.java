import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class form_check_for_pass extends Applet implements ActionListener,ComponentListener,FocusListener
{
    TextField t1,t2;
    Label l1,l2;
    Button b1,b2;
    String msg;
    public void init()
    {
        t1=new TextField(34);
        t2=new TextField(15);
        l1=new Label("Name",Label.LEFT);
        l2=new Label("Password",Label.LEFT);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        b1=new Button("Submit query");
        b2=new Button("Forgot password?");
        add(b1);
        add(b2);
        t2.setEchoChar('*');
        t1.addFocusListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b2.addComponentListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            b2.show();
        }
        else if(e.getSource()==b2) 
        {
            msg="Entered password is "+t2.getText();
            repaint();
        }
        else
        {
            b2.hide();
        }
    }
    public void componentResized(ComponentEvent ce)
    {
        msg="Window Resized";
        repaint();
    }    
    public void componentMoved(ComponentEvent ce)
    {
        msg="Window moved";
        repaint();
    }
    public void componentShown(ComponentEvent ce) 
    {
        msg="Window moved";
        repaint();
    }
    public void componentHidden(ComponentEvent ce) 
    {
        msg="Window is hidden";
        repaint();
    }
    public void focusGained(FocusEvent e)
    {
        showStatus("Name field got keyboard focus");
        b2.hide();
    }
    public void focusLost(FocusEvent e)
    {
        showStatus("Name field lost keyboard focus");
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,6,80);
    }
}