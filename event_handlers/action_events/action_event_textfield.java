import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class action_event_textfield extends Applet implements ActionListener,FocusListener
{
    TextField t1,t2;
    Label l1,l2;
    public void init()
    {
        l1=new Label("Name",Label.LEFT);
        l2=new Label("Password",Label.LEFT);
        t1=new TextField(34);
        t2=new TextField(20);
        t2.setEchoChar('*');
        add(l1);
        add(t1);
        add(l2);
        add(t2);

        t1.addActionListener(this);
        t2.addActionListener(this);
        t1.addFocusListener(this);
        t2.addFocusListener(this);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        repaint();
    }

    public void focusGained(FocusEvent e)
    {
        if(e.getSource()==t1)
        {
            showStatus("Name textfield got focus");
        }
        else 
        {
            showStatus("Password field got focus");
        }
        
    }

    public void focusLost(FocusEvent e)
    {
        if(e.getSource()==t1)
        {
            showStatus("Name textfield lost focus");
        }
        else 
        {
            showStatus("Password field lost focus");
        }
        
    }

    public void paint(Graphics g)
    {
        g.drawString("Text Name entered : = "+t1.getText(), 6,60);
        g.drawString("Password kept secret : = "+t2.getText(),6, 80);
        g.drawString("Selected text name : = "+t1.getSelectedText(), 6, 100);
    }
}