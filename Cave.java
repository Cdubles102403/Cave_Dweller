/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CSchafer
 */
public class Cave {
    // make variables
    private Caveman cman;
    private Bomb bomb;
    private Bomb bomb2;
    private Bomb bomb3;
    private Potion potion;
    private Door door;
    private flashlight fl;
    private int width, height;
    private final int MAX_WIDTH = 50, MAX_HEIGHT = 50;
     
    
    
    public Cave(String username) {
        //fill variables
        this.width = (int) (Math.random() * MAX_WIDTH);
        this.height = (int) (Math.random() * MAX_HEIGHT);
        cman = new Caveman(username, this);
        bomb = new Bomb(this);
        bomb2 = new Bomb(this);
        bomb3 = new Bomb(this);
        potion = new Potion(this);
        fl = new flashlight(this);
        door = new Door(this);
        
    }
    
    
    

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    public void checkCollisions() {
        //check bomb 1
        if (cman.getX() == bomb.getX() && cman.getY() == bomb.getY()) {
            cman.detonate(bomb);
        }
        //checks bomb2
        if (cman.getX() == bomb2.getX() && cman.getY() == bomb2.getY()) {
            cman.detonate(bomb2);
        }
        //check bomb3
        if (cman.getX() == bomb3.getX() && cman.getY() == bomb3.getY()) {
            cman.detonate(bomb3);
        }
        //check potion 
        if (cman.getX() == potion.getX() && cman.getY() == potion.getY()) {
            cman.drink(potion);
        }
        //check flashlight
        if (cman.getX() == fl.getX() && cman.getY() == fl.getY()) {
            cman.flashLight();
            System.out.println("flash light picked up, use flash to use it!");
            fl.Flash();
        }
        // check door
        if(cman.getX() == door.GetX() && cman.getY() == door.GetY()){
            System.out.println("you escaped the cave!");
            System.exit(0);
        }
   
       
    }
    //takes inputs
    public void processPrompt(String prompt) {
        if (prompt.equals("right") && cman.getX() <= 50) {
            cman.move(1,0);
        
        }
        else if (prompt.equals("left") && cman.getX() <= 0) {
            cman.move(-1,0);
            
        }
        else if (prompt.equals("forward") && cman.getY() <= 0) {
            cman.move(0,1);
           
        }
        else if (prompt.equals("back") && cman.getY() <= 50) {
            cman.move(0,-1);
            
        }
        else if (prompt.equals("flash")) {
            fl.Flash();
        }
        
        else if(prompt.equals("dev_pos")){
        System.out.println("player pos is " + cman.getX() + "" + cman.getY());
        System.out.println("door pos is " + door.GetX() + door.GetY());
        }
        
        else{
            System.out.println("you can not move");
        }
        checkCollisions();
        
        
    }
    
    
}