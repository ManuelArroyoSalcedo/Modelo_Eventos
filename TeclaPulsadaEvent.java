package teclado1_2;

import java.util.EventObject;

/**
 *
 * @author Manuel Arroyo Salcedo
 */
public class TeclaPulsadaEvent extends EventObject{
    public TeclaPulsadaEvent(Object source) {
        super(source);
    }

    public int getNumero() {
        return (int) this.getSource();
    }
}
