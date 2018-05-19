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
public abstract class Piezas {
    private int x;
    private int y;
    private Color color;
    private String material;
    
    public Piezas() {
    }

    public Piezas(int x, int y, Color color, String material) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.material = material;
    }

    
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }                  

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Piezas{" + "x=" + x + ", y=" + y + ", color=" + color + ", material=" + material + '}';
    }

   
    
    public abstract boolean movi(int x, int y);
    
}
