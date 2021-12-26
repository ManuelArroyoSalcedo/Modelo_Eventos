
package teclado1_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Manuel Arroyo Salcedo
 */
public class teclado01_2 extends JPanel implements Serializable{
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    
    private JLabel pantalla;
    
    private ArrayList<TeclaPulsadaListener> listaListener = new ArrayList();
    
    public teclado01_2() {
        init();
    }
    
    private void init(){
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();

        boton1.setText("1");
        boton1.setPreferredSize(new java.awt.Dimension(40, 40));
        this.add(boton1);

        boton2.setText("2");
        boton2.setPreferredSize(new java.awt.Dimension(40, 40));
        this.add(boton2);

        boton3.setText("3");
        boton3.setPreferredSize(new java.awt.Dimension(40, 40));
        this.add(boton3);
        
        ActionListener a1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TeclaPulsadaEvent evento = new TeclaPulsadaEvent(1);
                fireTeclaPulsadaListener(evento, pantalla);
            }
        };
        boton1.addActionListener(a1);

        ActionListener a2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TeclaPulsadaEvent evento = new TeclaPulsadaEvent(2);
                fireTeclaPulsadaListener(evento, pantalla);
            }
        };
        boton2.addActionListener(a2);

        ActionListener a3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TeclaPulsadaEvent evento = new TeclaPulsadaEvent(3);
                fireTeclaPulsadaListener(evento, pantalla);
            }
        };
        boton3.addActionListener(a3);
    }
    
    public void setPantalla(JLabel pantalla){
       this.pantalla = pantalla;
    }
    
    //EVENTOS
    public void addTeclaPulsadaListener(TeclaPulsadaListener listener){
        listaListener.add(listener);
    }

    public void removeTeclaPulsadaListener(TeclaPulsadaListener listener){
        listaListener.remove(listener);
    }
    
    public void fireTeclaPulsadaListener(TeclaPulsadaEvent evento, JLabel pantalla) { 
        for (TeclaPulsadaListener listener : listaListener) { 
            listener.teclaPulsada(evento, pantalla); 
        } 
    }    
}
