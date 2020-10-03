
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
class Quiz {
    //Method
    public static boolean askQuestion(String question, String correctAnswer) {
        boolean correct = false;
        Scanner getInput = new Scanner(System.in);  //use the scanner class
        System.out.println(question);
        String answer = getInput.nextLine();  //Read the next line typed
        System.out.println("Your answer was" + answer);  //This is called concatenation
        if (answer.equals(correctAnswer)){
            correct = true;
        }
        return correct;
        
        
                
    }
}
