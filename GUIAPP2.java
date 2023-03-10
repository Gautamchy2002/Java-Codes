import javax.swing.*;
import java.awt.*;
public class GUIAPP2 {
public static void main (String[] args) {
JFrame f=new JFrame();
f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
f.setSize(700,500);
f.setTitle("MINICALCI");
f.setLayout(null);
JLabel l=new JLabel ("ENTER A NO.:- ");
l.setBounds(50,40,200,80);
f.add(l);
JTextField t=new JTextField ( );
t.setBounds(150, 70, 150, 30);
f.add(t);
JLabel k=new JLabel ("ENTER A NO.:- ");
k.setBounds(50, 90, 100, 80);
f.add(k);
JTextField m=new JTextField ();
m.setBounds(150, 110, 150, 30);
f.add(m);
JButton b1=new JButton ("+");
b1.setBounds(50, 200, 70, 30);
f.add(b1);
JButton b2=new JButton ("-");
b2.setBounds(130, 200, 70, 30);
f.add(b2);
JButton b3=new JButton ("*");
b3.setBounds(210, 200, 70, 30);
f.add(b3);
JButton b4=new JButton ("/");
b4.setBounds(290, 200, 70, 30);
f.add(b4);
JButton b5=new JButton ("%");
b5.setBounds(370, 200, 70, 30);
f.add(b5);
JLabel n=new JLabel ("ANSWER :- ");
n.setBounds(50, 250, 100, 80);
f.add(n);
JLabel p=new JLabel ("------------------- ");
p.setBounds(140, 250, 100, 80);
f.add(p);


f.setVisible(true);
}
}
