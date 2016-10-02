/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.HashMap;
/**
 *
 * @author jayj5
 */
public class TextUserInterface {
    
    private Dictionary dictionary;
    private Scanner reader;

    public TextUserInterface (Scanner reader, Dictionary dictionary){
    
        this.dictionary = dictionary;
        this.reader =reader;
    }
    
    public void start(){
    
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");
        
        while (true){
        
            System.out.print("Statement: ");
            String input = reader.nextLine();
            
            if (input.equals("quit")){
            
                System.out.println("Cheers!");
            
                break;
            }
            else if (input.equals("add")){
            
                System.out.print("In Finnish: ");
                String input1 = reader.nextLine();
                System.out.print("Translation: ");
                String input2 = reader.nextLine();
                this.dictionary.add(input1, input2);
            }
            
            else if (input.equals("translate")){
            
                System.out.print("Give a word: ");
                String input5 = reader.nextLine();
                System.out.println("Translation: "+ this.dictionary.translate(input5));
            }
            else {
            
                System.out.println("Unknown statement");
            }
            
            
            
        }
        
    }
}
