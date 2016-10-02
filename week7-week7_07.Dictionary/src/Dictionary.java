/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;

import java.util.ArrayList;
/**
 *
 * @author jayj5
 */
public class Dictionary {
    
    private HashMap<String, String> dictionary = new HashMap<String, String>();
    
    public Dictionary(){}
    
    public String translate(String word){
    
        if (this.dictionary.containsKey(word)){
        
            return this.dictionary.get(word);
        }
        else {
        
            return null;
        }
    }
    
    public void add(String word, String translation){
    
        if (this.dictionary.containsKey(word)){}
        else {
        
            this.dictionary.put(word, translation);
        
        }
        
    }
    
    public int amountOfWords(){
    
        int amount =this.dictionary.size();
        return amount;
    }
    
    public ArrayList<String> translationList(){
    
        ArrayList<String> list = new ArrayList<String>();

        for (String word : this.dictionary.keySet()){
        
            list.add(word + " = "+ this.dictionary.get(word));
        }
        return list;
        
        
    }
}
