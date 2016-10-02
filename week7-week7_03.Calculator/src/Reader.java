/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author jayj5
 */
public class Reader {
 

    private Scanner reader = new Scanner(System.in);
    public String readString(){
    
        String out = reader.nextLine();
        return out;
    }
    
    public int readInteger(){
    
        int out2 = Integer.parseInt(reader.nextLine());
        return out2;
    }
}
