import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class options extends Applet implements ActionListener,ItemListener
{
    Choice c1,c2;
    Label l1,l2;
    Button b;
    String msg1="";
    String msg2="";
    String ar[][]={{"Google Play Store","Google Chrome","Google Wear","Pixel"},{"Apple App Store","Apple Watch","Safari","Iphone"},{"Samsung Apps","Samsung Gear","Samsung Browser","Galaxy s"},{"Xiaomi App Store","Xiaomi Gear","Redmi Phone","Xiaomi Browser"}};
    public void init()
    {
        c1=new Choice();
        l1=new Label("Brand");
        l2=new Label("Offering");
        c2=new Choice();
        c1.add("Google");
        c1.add("Apple");
        c1.add("Samsung");
        c1.add("Xiaomi");
        
        c1.addItemListener(this);
        add(l1);
        add(c1);
        add(l2);
        add(c2);

        b=new Button("Submit");
        add(b);

        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        msg1="Brand Selected : - "+c1.getSelectedItem();
        msg2="Offering Selected :- "+c2.getSelectedItem();


        repaint();
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==c1)
        {
            int index=c1.getSelectedIndex();
            int len=c2.getItemCount();
            int i=0;
            for(i=0;i<len;i++)
            {
                c2.remove(0);
            }
            for(i=0;i<ar[index].length;i++)
            {
                c2.add(ar[index][i]);
            }
        }
    }
    public void paint(Graphics g)
    {
        g.drawString(msg1, 10, 60);
        g.drawString(msg2,10,100);
    }

}