package LoanCalculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class LoanCalculator extends JFrame implements ActionListener{
    JLabel label1,label2, label3, label4,label5, label6;
    JTextField interes, anos, monto, pagoMes, pagoTotal;
    JButton boton;
   // JTextArea pagoMes, pagoTotal;
    String rate, year, amount, pames, patol;
    double inter, ano, mont, num, den, interesf, potencia, anio, montoMes, montoAno;
    
    public LoanCalculator(){
        interes = new JTextField();
        anos = new JTextField();
        monto = new JTextField();
        pagoMes = new JTextField();
        pagoTotal = new JTextField();        
        boton = new JButton("Compute Payment");
        
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 200));
        frame.setTitle("LoanCalculator");
        frame.setLayout(new BorderLayout());
        
        JPanel norte = new JPanel(new FlowLayout());
        norte.add(new JLabel("Enter loan amount, interest rate, and years"));
        
        JPanel centroizq = new JPanel(new GridLayout(5,1));
        centroizq.add(new JLabel("Annual Interest Rate"));
        centroizq.add(new JLabel("Number of Years"));
        centroizq.add(new JLabel("Loan Amount"));
        centroizq.add(new JLabel("Monthly Payment"));
        centroizq.add(new JLabel("Total Payment"));
        
        JPanel centroder = new JPanel(new GridLayout(5,1));
        centroder.add(interes);
        centroder.add(anos);
        centroder.add(monto);
        centroder.add(pagoMes);
        centroder.add(pagoTotal);
        
        JPanel centro = new JPanel(new BorderLayout());
        centro.add(centroizq, BorderLayout.WEST);
        centro.add(centroder, BorderLayout.CENTER);
                
        JPanel sur = new JPanel(new BorderLayout());
        sur.add(boton,BorderLayout.EAST );
        boton.addActionListener(this);
         
        frame.add(norte, BorderLayout.NORTH);
        frame.add(centro, BorderLayout.CENTER);
        frame.add(sur, BorderLayout.SOUTH);
        frame.setVisible(true);
        
    }
    public static void main(String[] args) {
        LoanCalculator p =new LoanCalculator();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== boton){
            Loan();
        }
    }
    
    
    public void Loan(){
        rate =interes.getText();
        year = anos.getText();
        amount = monto.getText();
        inter = Double.parseDouble(rate);
        ano = Double.parseDouble(year);
        mont = Double.parseDouble(amount);
        
        anio = ano * 12;
        interesf = (inter/100);
        potencia = Math.pow((1+interesf ),-anio);
        num = interesf * mont;
        den = 1-potencia;
        
        montoMes = num/den;
        montoAno = (num/den)* anio;
               
        pames = Double.toString(montoMes);
        patol = Double.toString(montoAno);
        pagoMes.setText(pames);
        pagoTotal.setText(patol);
    }

    
}