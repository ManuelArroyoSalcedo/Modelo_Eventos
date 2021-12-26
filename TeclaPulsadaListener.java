package teclado1_2;

import java.util.EventListener;
import javax.swing.JLabel;

/**
 *
 * @author Manuel Arroyo Salcedo
 */
public interface TeclaPulsadaListener extends EventListener{
    public void teclaPulsada(TeclaPulsadaEvent evento, JLabel pantalla);
}
