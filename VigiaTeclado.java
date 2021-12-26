package teclado1_2;


import javax.swing.JLabel;

/**
 *
 * @author Manuel Arroyo Salcedo
 */
public class VigiaTeclado implements TeclaPulsadaListener{
    @Override
    public void teclaPulsada(TeclaPulsadaEvent evento, JLabel pantalla) {
        pantalla.setText(pantalla.getText() + evento.getNumero());
    }
}
