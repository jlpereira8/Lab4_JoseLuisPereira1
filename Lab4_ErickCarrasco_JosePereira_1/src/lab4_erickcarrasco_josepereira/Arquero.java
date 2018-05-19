
package lab4_erickcarrasco_josepereira;

import java.awt.Color;


public class Arquero extends Piezas{

    public Arquero() {
    }

    public Arquero(int x, int y, Color color, String material) {
        super(x, y, color, material);
    }

    @Override
    public boolean movi(int x, int y) {
        boolean ve=true;
        super.setX(x);
        super.setY(y);
        return ve;
    }
}
    

