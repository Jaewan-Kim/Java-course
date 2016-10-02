/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jayj5
 */
public class Calculator {
    
    private Reader reader = new Reader();
    private int number;
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                number++;
            } else if (command.equals("difference")) {
                difference();
                
                number++;
            } else if (command.equals("product")) {
                product();
                
                number++;
            }
        }

        statistics();
    }
    
    private void sum(){
    
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        int answer = value1 + value2;
        System.out.println("sum of the values " + answer);
        
        
        
    }
    
    private void difference(){
    
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        int answer = value1 - value2;
        System.out.println("difference of the values " + answer);
        
    }
    
    private void product(){
    
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        int answer = value1 * value2;
        System.out.println("product of the values " + answer);
        
    }
    
    private void statistics(){
    
        System.out.println("Calculations done " + this.number);
    }
}
