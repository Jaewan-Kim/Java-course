/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author jayj5
 */
public class Changer {
   
    private ArrayList<Change> list = new ArrayList<Change>();
    
    public Changer(){}
    
    public void addChange(Change change){
    
        this.list.add(change);
    }
    
    public String change(String characterString){
    
        for (Change change : list) {
        
            characterString = change.change(characterString);
        }
    
        return characterString;
    }
}
