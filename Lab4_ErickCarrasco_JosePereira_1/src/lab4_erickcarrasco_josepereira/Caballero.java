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
public class Caballero extends Piezas {

    public Caballero() {
    }

    public Caballero(int x, int y, Color color, String material) {
        super(x, y, color, material);
    }

    
    
    @Override
    public boolean movi(int x, int y) {
        if (x == super.getX() + 1 || x == super.getX() - 1 || y == super.getY() - 1 || y == super.getY() + 1) { //super es igual a clase piezas
            super.setX(x);
            super.setY(y);
            return true;
        } else {
            return false;
        }

    }

}
