/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CSchafer
 */
public class Door {
    private int x,y;
    
    Door(Cave cave){
        this.x = (int)(Math.random() * cave.getWidth());
        this.y = (int)(Math.random() * cave.getHeight());
    }
    public int GetY(){
        return this.y;
    }
    public int GetX(){
        return this.x;
    }
}
