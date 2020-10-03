
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leon
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Simple Quiz");
        
        if (Quiz.askQuestion("When did Neil Armstrong set foot on the moon? ", "1969")){
            System.out.println("You are a genius!");
        } else {
            System.out.println("You are too stupid.");
        }
    }
}
        
        
            
                    
        
 
