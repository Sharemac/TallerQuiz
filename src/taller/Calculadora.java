
package taller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.management.Query.lt;

public class Calculadora extends JFrame{
        JPanel principal;
        JPanel botones, botones2, botones3, auxb, aux2;
        JTextField texto;
        JButton boton[], boton2[], boton3[];
        JLabel espacio;
        double ope1=0,ope2=0, resultado=0;
        String operacion=" ";
        boolean nueva =true;
        
        
    public Calculadora(){
        setTitle("Calculadora");
        setSize(new Dimension(480, 200));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image icon = Toolkit.getDefaultToolkit().getImage("calculadora");
        setIconImage(icon);
        Metodo1();
        setVisible(true);
    
}
    public void Metodo1(){
        
        texto = new JTextField();
        
        
        botones2 = new JPanel();
        botones2.setLayout(new GridLayout(1, 3, 2, 2));
        espacio = new JLabel("");
            
        aux2 = new JPanel(new BorderLayout());
        aux2.add(botones2, BorderLayout.EAST);
        aux2.add(espacio,BorderLayout.WEST );
        
        botones = new JPanel();
        botones.setLayout(new GridLayout(4, 5, 1, 1));
        
        botones3 = new JPanel();
        botones3.setLayout(new GridLayout(4, 1, 1, 1));
        
        auxb = new JPanel(new BorderLayout());
        auxb.add(botones3, BorderLayout.WEST);
        auxb.add(botones, BorderLayout.EAST);
        Botones();
        
        principal = new JPanel(new BorderLayout());
        principal.add(texto, BorderLayout.NORTH);
        principal.add(aux2, BorderLayout.CENTER);
        principal.add(auxb, BorderLayout.SOUTH);
        
        getContentPane().add(principal);

    }
    public static void main(String[] args) {
        new Calculadora();
    }
    
    private void Botones(){
        boton = new JButton[20];
        
        boton[0] = new JButton("7");
        boton[0].setForeground(java.awt.Color.blue);
        boton[1] = new JButton("8");
        boton[1].setForeground(java.awt.Color.blue);
        boton[2] = new JButton("9");
        boton[2].setForeground(java.awt.Color.blue);
        boton[3] = new JButton("/");
        boton[3].setForeground(java.awt.Color.red);
        boton[4] = new JButton("sqrt");
        boton[4].setForeground(java.awt.Color.blue);
        boton[5] = new JButton("4");
        boton[5].setForeground(java.awt.Color.blue);
        boton[6] = new JButton("5");
        boton[6].setForeground(java.awt.Color.blue);
        boton[7] = new JButton("6");
        boton[7].setForeground(java.awt.Color.blue);
        boton[8] = new JButton("*");
        boton[8].setForeground(java.awt.Color.red);
        boton[9] = new JButton("%");
        boton[9].setForeground(java.awt.Color.blue);
        boton[10] = new JButton("1");
        boton[10].setForeground(java.awt.Color.blue);
        boton[11] = new JButton("2");
        boton[11].setForeground(java.awt.Color.blue);
        boton[12] = new JButton("3");
        boton[12].setForeground(java.awt.Color.blue);
        boton[13] = new JButton("-");
        boton[13].setForeground(java.awt.Color.red);
        boton[14] = new JButton("1/x");
        boton[14].setForeground(java.awt.Color.blue);
        boton[15] = new JButton("0");
        boton[15].setForeground(java.awt.Color.blue);
        boton[16] = new JButton("+/-");
        boton[16].setForeground(java.awt.Color.blue);
        boton[17] = new JButton(".");
        boton[17].setForeground(java.awt.Color.blue);
        boton[18] = new JButton("+");
        boton[18].setForeground(java.awt.Color.red);
        boton[19] = new JButton("=");
        boton[19].setForeground(java.awt.Color.red);
        
        for(int i = 0; i < 20; i++){
            botones.add(boton[i]);
         }
        
         boton2 = new JButton[3];
        
        
        boton2[0] = new JButton("Backspace");
        boton2[1] = new JButton("CE");
        boton2[2] = new JButton("C");
        
        for(int i = 0; i < 3; i++){
            botones2.add(boton2[i]);
            boton2[i].setForeground(java.awt.Color.red);
    }
        
        boton3 = new JButton[4];
        
        boton3[0] = new JButton("MC");
        boton3[1] = new JButton("MR");
        boton3[2] = new JButton("MS");
        boton3[3] = new JButton("M+");
        for(int i = 0; i < 4; i++){
            botones3.add(boton3[i]);
            boton3[i].setForeground(java.awt.Color.red);
        }
        
   boton[0].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(nueva){
                texto.setText("");
                nueva=false;
                }
             texto.setText(texto.getText()+"7");
            }
        });
   boton[1].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(nueva){
                texto.setText("");
                nueva=false;
                }
              texto.setText(texto.getText()+"8");
            }
        });
   boton[2].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(nueva){
                texto.setText("");
                nueva=false;
                }
              texto.setText(texto.getText()+"9");
            }
        });
   boton[5].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(nueva){
                texto.setText("");
                nueva=false;
                }
              texto.setText(texto.getText()+"4");
            }
        });
   boton[6].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(nueva){
                texto.setText("");
                nueva=false;
                }
             texto.setText(texto.getText()+"5");
            }
        });
   boton[7].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(nueva){
                texto.setText("");
                nueva=false;
                }
                texto.setText(texto.getText()+"6");
            }
        });
   boton[12].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(nueva){
                texto.setText("");
                nueva=false;
                }
            texto.setText(texto.getText()+"3");
            }
        });
   boton[11].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(nueva){
                texto.setText("");
                nueva=false;
                }
             texto.setText(texto.getText()+"2");
            }
        });
   boton[10].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(nueva){
                texto.setText("");
                nueva=false;
                }
             texto.setText(texto.getText()+"1");
            }
        });
   boton[15].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(nueva){
                texto.setText("");
                nueva=false;
                }
             texto.setText(texto.getText()+"0");
            }
        });
   boton[17].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(nueva){
                texto.setText("");
                nueva=false;
                }
             texto.setText(texto.getText()+".");
            }
        });
   boton[18].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    if(ope1!=0)
                        ope1=ope1+Double.parseDouble(texto.getText());
                    else
                        ope1=Double.parseDouble(texto.getText());
                    operacion="suma";
                    texto.setText("");
                }catch(Exception ex){
                }
            }
        });
        boton[13].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    if(ope1!=0)
                        ope1=ope1-Double.parseDouble(texto.getText());
                    else
                        ope1=Double.parseDouble(texto.getText());
                    operacion="resta";
                    texto.setText("");
                }catch(Exception ex){}
            }
        });
        boton[8].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    if(ope1!=0)
                        ope1=ope1*Double.parseDouble(texto.getText());
                    else
                        ope1=Double.parseDouble(texto.getText());
                    operacion="multiplicacion";
                    texto.setText("");
                }catch(Exception ex){
                }
            }
        });
        boton[3].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    if(ope1!=0)
                        ope1=ope1/Double.parseDouble(texto.getText());
                    else
                        ope1=Double.parseDouble(texto.getText());
                    operacion="division";
                    texto.setText("");
                }catch(Exception ex){
                }
            }
        });
        boton[19].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    ope2=Double.parseDouble(texto.getText());
                }catch(Exception err){
                }
                if(operacion.equals("suma")){
                    double resultado=ope1+ope2;
                    texto.setText(String.valueOf(resultado));
                    ope1=ope2=0;
                    operacion="";
                }else if(operacion.equals("resta")){
                    double resultado=ope1-ope2;
                    texto.setText(String.valueOf(resultado));
                    ope1=ope2=0;
                    operacion="";
                }else if(operacion.equals("multiplicacion")){
                    double resultado=ope1*ope2;
                    texto.setText(String.valueOf(resultado));
                    ope1=ope2=0;
                    operacion="";
                }else if(operacion.equals("division")){
                    double resultado=ope1/ope2;
                    texto.setText(String.valueOf(resultado));
                    ope1=ope2=0;
                    operacion="";
                }
                nueva=true;
            }
        });
        
        boton2[1].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                texto.setText("");
                ope1=ope2=0;
                operacion="";
            }
        });
        boton2[2].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                texto.setText("");
                ope1=ope2=0;
                operacion="";
            }
        });
   
   
   
  }
}
