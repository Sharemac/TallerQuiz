
package Open_close;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

    public class Openclose extends JFrame implements ActionListener{
        JPanel principal;
        JButton boton1, boton2;
        JTextField texto;
        String  clave1;
        int cla=0,clave = 1234;
        /*
        
    JPanel p;
    JTextField nombre;
    JTextField apellido;
    JLabel label1, label2, label3;
    JButton done;
        label1 = new JLabel("Enter your first name");
        label1.setBounds(20, 10 , 150, 20);
        */
        
      public Openclose(){
          boton1 = new JButton("Open/Close");
          boton1.setBounds(0, 0, 150, 20);
          texto = new JTextField();
          texto.setBounds(0, 20, 150, 20);
          boton2 = new JButton("Change Combination");
          boton2.setBounds(0, 40, 150, 20);
          boton2.addActionListener(this);
          
          principal = new JPanel();
          principal.add(boton1);
          principal.add(texto);
          principal.add(boton2);
          principal.setLayout(null);
          principal.add("North", boton1);
          principal.add("Center", texto);
          principal.add("South", boton2);
          getContentPane().add(principal);
          setSize(150,80);
          setVisible(true);
        
      }
 
    public static void main(String[] args) {
        new Openclose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clave1 = texto.getText();
        cla = Integer.parseInt(clave1);
        if(e.getSource()== boton2){
        if(cla == clave){
          boton1.setBackground(Color.GREEN);
          boton1.setOpaque(true);
          boton1.setBorderPainted(false);
        }else if(cla != clave){
          boton1.setBackground(Color.RED);
          boton1.setOpaque(true);
          boton1.setBorderPainted(false);
    
   }      
}
    }
    
    }
/*public void actionPerformed(ActionEvent e) {
	JButton botonPulsado = (JButton) e.getSource();
	botonPulsado.setBackground(Color.red);
	botonPulsado.setEnabled(false);
 
}*/
