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
public class Airport {
    private HashMap<String, Integer> planes = new HashMap<String,Integer>();
    private ArrayList<String> planes2 = new ArrayList<String>();
    
    
    
    public Airport(){}
    
    public void addAirplane(String name, int capacity){

        if (this.planes.containsKey(name)){}
        else {
        
            this.planes.put(name,capacity);
        }
    }
    
    public void addFlight (String name, String dep, String dest){
    
        if (this.planes.containsKey(name)){
        
            String in = name + " ("+this.planes.get(name) + " ppl) ("+dep + "-" + dest+")";
            planes2.add(in);
        }
    }
    
    public void printPlanes(){
    
        for (String name : this.planes.keySet()){
        
            System.out.println(name + " (" + this.planes.get(name) + " ppl)");
        }
    }
    
    public void printFlights(){
    
        System.out.println("");
        for (String name : this.planes2){
        
            System.out.println(name);
        }
    }
    
    public void search(String name){
    
        if (this.planes.containsKey(name)){
        
            System.out.println(name + " ("+ this.planes.get(name)+ " ppl)");
        }
    }
}
