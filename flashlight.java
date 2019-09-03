/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cschafer
 */
public class flashlight {
    private int x, y;
    
    private Bomb b;
    private Potion p;

    public flashlight(Cave cave) {
        this.x = (int)(Math.random() * cave.getWidth());
        this.y = (int)(Math.random() * cave.getHeight());
        
    }
    
    public int getY(){
        return y;
    }
    
    public int getX(){
        return x;
    }
    
    public void Flash(){
       System.out.println("bombs x is: " + b.getX());
       System.out.println("bombs y is: " + b.getY());
       System.out.println("potion x is: " + p.getX());
       System.out.println("potion y is: " + p.getY());

   }
}
