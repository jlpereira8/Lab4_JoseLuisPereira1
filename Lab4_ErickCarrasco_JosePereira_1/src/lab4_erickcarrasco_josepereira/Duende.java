/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_erickcarrasco_josepereira;

import java.awt.Color;

/**
 *
 * @author j0c3lwiz
 */
public class Duende extends Piezas{

    public Duende() {
    }

    public Duende(int x, int y, Color color, String material) {
        super(x, y, color, material);
    }

    
    
    
    
    @Override
    public boolean movi(int x, int y) {
        boolean val = true;
        if (super.getColor().equals(Color.white)) {
            if (y > super.getY()) {
                super.setX(x);
                super.setY(y);
                val = true;
            }
        }else if (super.getColor().equals(Color.black)) {
            if (y < super.getY()) {
                super.setX(x);
                super.setY(y);
                val = true;
            }
        }
        return val;
    }

   
    
}
