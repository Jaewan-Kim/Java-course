/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jayj5
 */
public class Thing {
    
    private String name;
    private int weight;
    
    public Thing(String name, int weight){
    
        this.name = name;
        this.weight = weight;
    }
    
    public String getName(){
    
        return this.name;
    }
    
    public int getWeight(){
    
        return this.weight;
    }
    
    public String toString(){
    
        String out = this.name + " (" + this.weight + " kg)";
    
    
        return out;
    }
}
