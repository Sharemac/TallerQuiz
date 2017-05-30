
package TextFieldTest;



import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TextFieldTest extends JFrame implements ActionListener{
    JPanel p;
    JTextField nombre;
    JTextField apellido;
    JLabel label1, label2, label3;
    JButton done;
    
   
    public TextFieldTest(){
        label1 = new JLabel("Enter your first name");
        label1.setBounds(20, 10 , 150, 20);
        
        label2 = new JLabel("Enter your last name");
        label2.setBounds(20, 50, 150, 20);
        
        nombre = new JTextField();
        nombre.setBounds(10, 30, 150, 20);
        
        apellido = new JTextField();
        apellido.setBounds(10, 70, 150, 20);
        
        done = new JButton("Done");
        done.setBounds(45, 100, 80, 20);
        done.addActionListener(this);
        
        label3 = new JLabel();
        label3.setBounds(20, 120, 150, 20);
        
        p = new JPanel();
        p.setLayout(null);
        p.add(label1);
        p.add(label2);
        p.add(nombre);
        p.add(apellido);
        p.add(done);
        p.add(label3);
        add(p);
        setSize(170,250);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TextFieldTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       label3.setText("Hello, "+ nombre.getText()+" " +apellido.getText());
    }
}