package lab4_erickcarrasco_josepereira;

import java.awt.Color;

/**
 *
 * @author j0c3lwiz
 */
public class Rey extends Piezas{

    public Rey() {
        super();
    }

    public Rey(int x, int y, Color color, String material) {
        super(x, y, color, material);
    }

    

    @Override
    public boolean movi(int x, int y) {
        super.setX(x);
        super.setY(y);
        return false;
    }

   
    
    
}    

