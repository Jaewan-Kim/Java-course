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
public class Suitcase {

    private int weight = 0;
    private int maximum; 
    private ArrayList<Thing> things = new ArrayList<Thing>();
    
    public Suitcase( int maximum){
    
        this.maximum = maximum;
    }
    
    public void addThing (Thing thing ){
    
        if (this.weight + thing.getWeight() <=this.maximum){
        this.weight +=thing.getWeight();
        this.things.add(thing);
        }
               
    }
    
    public String toString(){
    
        if (this.things.size() == 0){
        
            return "empty (0 kg)";
        }
        else if (this.things.size() == 1){
    
        return "1 thing (" + this.weight + " kg)";
    
        }
        else {
        return (this.things.size() + " things (" + this.weight + " kg)");
        }
        
    }
    
    public void printThings(){
    
        System.out.println("Your suitcase contains the following things:");
        
        for (Thing thing : this.things){
        
            System.out.println(thing.getName() + " (" + thing.getWeight() + " kg)");
        }
    }
    
    public int totalWeight(){
    
        return this.weight;
    }

    public Thing heaviestThing(){
    
       if (this.things.isEmpty()){
       
           return null;
       }
       else {
       
           Thing it = things.get(0);
           for (Thing thing : things){
           
               if (it.getWeight() <thing.getWeight()){
               
                   it = thing;
               }
           }
           return it;
       }
    }
}
