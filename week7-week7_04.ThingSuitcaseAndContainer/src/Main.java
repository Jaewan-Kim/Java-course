
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!

        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(mobile);
        suitcase.addThing(brick);

        Thing heaviest = suitcase.heaviestThing();
        System.out.println("The heaviest thing: " + heaviest);
        
        Suitcase suitcase1 = new Suitcase(20);
suitcase1.addThing(new Thing("Carrot", 2));
suitcase1.addThing(new Thing("Kaali", 8));
suitcase1.addThing(new Thing("Nauris", 4));
Thing heaviest1 = suitcase1.heaviestThing();
System.out.println(heaviest1);
    }

    public static void addSuitcasesFullOfBricks(Container container){
    
        int weight = 1;
        for (int i = 0; i < 100 ; i++){
        
            Thing brick = new Thing ("Brick",weight);
            Suitcase suitcase = new Suitcase(100);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
            weight ++;
            if (weight == 101){
            
                weight = 100;
            }
        }
    }
}
