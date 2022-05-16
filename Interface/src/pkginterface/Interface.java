/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Cristal Ramos
 */
public class Interface extends JFrame implements ActionListener{
    private JButton b1;
    private JTextField campo1;
    private JTextField campo2;
    private JLabel etq1;
    private JLabel etq2;
    private Panel panelEntrada, panelSalida;
    private JPanel panelVentana;
    
    
    public Interface (){
        
        //Creamos el boton
        b1= new JButton("Cifrado");
        
        //regitramos a la ventana como oyente
        b1.addActionListener(this);
        
        //creamos las etiquetas 
        etq1= new JLabel ("Texto");
        etq2= new JLabel("Cifrado");
        
        //Creamos los campos de texto
        campo1= new JTextField("");
        campo2= new JTextField("");
        
        //Cambiamos propiedades de los textos
        campo2.setEditable(false);
        campo2.setColumns(10);
        campo2.setBackground(Color.lightGray);
        campo1.setColumns(10);
        
        //creamos los paneles auxiliares
        panelEntrada = new Panel();
        panelSalida= new Panel();
        
        //Obtenemos la referencia al panel principal
        panelVentana= (JPanel)this.getContentPane();
        
       // agregamos los componentes del panel de entrada
       panelEntrada.add(campo1,BoxLayout.X_AXIS);
       panelEntrada.add(etq1,BoxLayout.Y_AXIS);
       
      //Agregamos los componentes del panel de salida
      panelSalida.add(campo2, BoxLayout.X_AXIS);
      panelSalida.add(etq2,BoxLayout.Y_AXIS);
      
      //Agregamos todo al panel principal
      panelVentana.add(panelEntrada,BorderLayout.NORTH);
      panelVentana.add(b1,BorderLayout.CENTER);
      panelVentana.add(panelSalida,BorderLayout.SOUTH);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Interface miApp = new Interface();
        miApp.setBounds(10,10,200,200);
        miApp.pack();
        miApp.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("");
    }
    
}
