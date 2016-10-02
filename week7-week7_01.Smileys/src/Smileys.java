
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }

    private static void printWithSmileys( String characterString){
    
        String smiley = ":)";
        int number = 3 + characterString.length()/2;
        
        
        boolean even = (characterString.length()%2==0);
        
        
        if (!even) {
        
            number ++;
        }
        for (int i = 0; i <number; i++){
        
            System.out.print(smiley);
        }        
        System.out.println("");
        
        if (even){
        
            System.out.println(smiley + " " + characterString + " " + smiley);
        }
        
        else {
        
            System.out.println(smiley + " " + characterString + "  " + smiley);
        }
        
        for (int i = 0; i <number; i++){
        
            System.out.print(smiley);
        }        
        System.out.println("");
    }
}
