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
public class UserInterface {
    
    private Scanner reader = new Scanner(System.in);
    
    private Airport airport = new Airport();
    
    public UserInterface(){}
    
    public void start(){
    
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        
        while (true){
        
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            
            String user = reader.nextLine();
            
            if (user.equals("x")){
            
                break;
            }
            else if (user.equals("1")){
            
                System.out.print("Give plane ID: ");
                String input1 = reader.nextLine();
                System.out.print("Give plane capacity: ");
                int input2 = Integer.parseInt(reader.nextLine());
                
                this.airport.addAirplane(input1, input2);
                
            }
            else if (user.equals("2")){
            
                System.out.print("Give plane ID: ");
                String ID = reader.nextLine();
                System.out.print("Give departure airport code: ");
                String dep = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String dest = reader.nextLine();
                
                this.airport.addFlight(ID , dep, dest);
            }
        }
        
        System.out.println("");
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        
        while (true){
        
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String user = reader.nextLine();
            if (user.equals("x")){
            
                break;
            }
            else if (user.equals("1")){
            
                this.airport.printPlanes();
            }
            else if (user.equals("2")){
            
                this.airport.printFlights();
                System.out.println("");
            }
            else if (user.equals("3")){
            
                System.out.print("Give plane ID: ");
                String name = reader.nextLine();
                
                this.airport.search(name);
            }
        }
        
    }
}
