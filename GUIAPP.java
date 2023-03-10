import javax.swing.*;
import java.awt.*;
public class GUIAPP {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(400,300);
		f.setTitle("Mera Pehla Frame");
		f.setLayout(null);
		JButton b1=new JButton("OK");
		b1.setBounds(50,60,70,40);
		f.add(b1);
		JButton b2=new JButton("OK2");
		b2.setBounds(140,60,70,40);
		f.add(b2);
		JLabel l=new JLabel("Enter Text:");
		l.setBounds(50,120,150,30);
		f.add(l);
		JTextField t=new JTextField();
		t.setBounds(150,120, 100, 30);
		f.add(t);
		f.setVisible(true);
	}

}
