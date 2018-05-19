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
public class Dragon extends Piezas{

    public Dragon() {
    }

    public Dragon(int x, int y, Color color, String material) {
        super(x, y, color, material);
    }

    @Override
    public boolean movi(int x, int y) {
        boolean ve=false;
        if(x+y==(10-1)||x==y){
            super.setX(x);
            super.setY(y);
            ve=true;
            return ve;
        }else{
        ve=false;
        return ve;
    }
    }
    
    
}
