/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
/**
 *
 * @author jayj5
 */
public class PromissoryNote {
    
    private HashMap<String, Double> notes = new HashMap<String, Double>();
    
    public PromissoryNote(){
    
        
    }
    
    public void setLoan(String toWhom, double value){
    
        this.notes.put(toWhom, value);
        
    }
    
    public double howMuchIsTheDebt(String whose){
    
        if (this.notes.containsKey(whose)){
        
            return this.notes.get(whose);
        }
        else {
        
            return 0;
        }
    }
}
