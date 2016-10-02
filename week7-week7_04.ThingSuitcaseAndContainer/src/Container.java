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
public class Container {
    
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    private int maximum;
    private int weight;
    public Container(int maximum){
    
        this.maximum = maximum;
    }
    public void addSuitcase(Suitcase suitcase){
    
        if (suitcase.totalWeight() + this.weight <= this.maximum){
        
            this.suitcases.add(suitcase);
            
            weight += suitcase.totalWeight();
        }
        
    }
    public String toString(){
    
        return (this.suitcases.size()+" suitcases (" + this.weight + " kg)");
    }
    
    public void printThings(){
    
        System.out.println("There are the following things in the container suitcases:");
        for (Suitcase suitcase : this.suitcases){
        
           
            suitcase.printThings();
        }
    }
    
}
