/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jayj5
 */
public class Change {

    private String newString="";
    private char character1;
    private char character2;
    public Change(char fromCharacter, char toCharacter){
    
        this.character1 = fromCharacter;
        this.character2 = toCharacter;
    }
    
    public String change(String characterString){
    
        for (int i = 0; i < characterString.length();i++){
        
            if (characterString.charAt(i) == character1){
            
                newString += character2;
                
            }
            
            else {
            
                newString += characterString.charAt(i);
            }
        }
        
        return newString;
    }
}
