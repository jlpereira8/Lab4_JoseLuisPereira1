
package lab4_erickcarrasco_josepereira;

import java.awt.Color;


public class Mago extends Piezas{

    public Mago() {
        super();
    }

    public Mago(int x, int y, Color color, String material) {
        super(x, y, color, material);
    }

    
    
    @Override
    public boolean movi(int x, int y) {
        boolean r=true;
        super.setX(x);
        super.setY(y);
        return r;
    }

    
    
}
