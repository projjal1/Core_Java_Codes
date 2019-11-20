import java.awt.*;
import java.applet.*;
import java.awt.event.*; 

public class code1 extends Applet implements AdjustmentListener
{
    Scrollbar t;
    TextArea ta;
    String msg;
    public void init()
    {
        t=new Scrollbar();
        ta=new TextArea("Hey there Sign up with me.!!",5,30);
        add(ta);
        add(t);
    
        t.addAdjustmentListener(this);
        
        t.setMaximum(500);
        t.setMinimum(10);
    }
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        if(e.getAdjustmentType()==e.BLOCK_DECREMENT)
        {
            showStatus("Block Decrement occured");
        }
        else if(e.getAdjustmentType()==e.BLOCK_INCREMENT)
        {
            showStatus("Block Increment occured");
        }
        else if(e.getAdjustmentType()==e.TRACK)
        {
            showStatus("Tracking occured");
        }
        else if(e.getAdjustmentType()==e.UNIT_DECREMENT)
        {
            showStatus("Unit Decrement occured");
        }
        else
        {
            showStatus("Unit Increment occured");
        }
        msg="Current value "+e.getValue();
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg, 5, 60);
    }     
}