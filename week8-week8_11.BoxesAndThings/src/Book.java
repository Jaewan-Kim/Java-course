/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jayj5
 */
public class Book implements ToBeStored {
    
    double weight;
    String writer;
    String name;
    public Book(String writer, String name, double weight)
    {
        this.weight = weight;
        this.writer = writer;
        this.name = name;
    }
    public double weight()
    {
        return this.weight;
    }
    
    public String toString ()
    {
        return (this.writer + ": " + this.name);
    }
    
}
