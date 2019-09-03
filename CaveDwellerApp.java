/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author CSchafer
 */
public class CaveDwellerApp {

    /**
     * @param args the command line arguments
     */
    //main method
    public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      System.out.println("What is your cave mans name?");
      String username = kb.nextLine();
      Cave cave = new Cave(username);
      String prompt = "";
      System.out.println(" controls \n1.) forward \n2.) backwards \n3.) left \n4.) right");
       while(!prompt.equals("close")) {
           //take and submit input
            prompt = kb.nextLine();
            cave.processPrompt(prompt);
        }
    }
    
}
