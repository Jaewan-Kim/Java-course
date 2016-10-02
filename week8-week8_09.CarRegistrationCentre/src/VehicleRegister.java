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
public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> list = new HashMap<RegistrationPlate, String>();
    
    public boolean add(RegistrationPlate plate, String owner)
    {
        int i =0;
        for (RegistrationPlate hi : list.keySet())
        {
            if (hi.equals(plate))
            {
                i ++;
            }
        }
        if (i > 0)
        {
            return false;
        }
        else 
        {
            list.put(plate, owner);
            return true;
        }
    }
    
    public String get(RegistrationPlate plate)
    {
   
        int i  =0;
        for (RegistrationPlate hi : list.keySet())
        {
        
            if (hi.equals(plate))
            {
                i++;
            }
        }
       if (i > 0)
       {
           return this.list.get(plate);
       }
       else 
       {
           
           return null;
       }
    }
    
    public boolean delete(RegistrationPlate plate)
    {
        int i =0;
        for (RegistrationPlate hi : list.keySet())
        {
            if (hi.equals(plate))
            {
                i ++;
            }
        }
        if (i > 0)
        {
            list.remove(plate);

            return true;
        }
        else 
        {
            return false;
        }

    }
    
    public void printRegistrationPlates()
    {
        for (RegistrationPlate hi : list.keySet())
        {
            System.out.println(hi);
        }
    }
    
    public void printOwners()
    {
        ArrayList<String> la = new ArrayList<String>();
        String value;
    for (RegistrationPlate hi : list.keySet())
        {
            value = this.list.get(hi);
            if (!la.contains(value))
            {
                la.add(value);
            }
        }
    
    for (String i : la)
    {
        System.out.println(i);
    }
    }
}
