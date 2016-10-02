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
public class Box implements ToBeStored {

    private ArrayList<Object> box;
    private double maxweight;
    private int total=0;
    private double weight;
    public Box(double weight)
    {
        this.maxweight = weight;
    }
    public double weight()
    {
        return this.weight;
    }
    
    public void add ( Book book)
    {
        if (book.weight()+this.weight <=this.maxweight)
        {
            box.add(book);
            total++;
        }
    }
    public void add ( CD cd)
    {
        if (cd.weight()+this.weight <=this.maxweight)
        {
            box.add(cd);
            total++;
        }
    }
    
    public String toString()
    {
        return ("Box: "+ this.total + " things, total weight " + this.weight + " kg");
    }
}
