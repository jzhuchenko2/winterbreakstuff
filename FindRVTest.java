import java.io.IOException;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.List;
import java.io.InputStreamReader;

public class FindRVTest {
    private static String sep = System.lineSeparator();

    public static void main(final String[] args)throws IOException { 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Set up the inventory
        RVInventory inventory = new RVInventory();
        initializeInventory(inventory);

        System.out.println("Specify RV search criteria");

        /*System.out.println("Specify blink search criteria");

         // Start out assuming the user doesn't care to specify a 50% start time criterion
         boolean stocknumberSpecified = false;
         String fiftyPercentStartTimeCriterion_ComparisonString = "";
         int fiftyPercentStartTimeCriterion_Value = 0;
 
         // Get the 50% start time criterion if the user wants to specify it.
         System.out.print("Would you like to specify a 50% start time criterion? [Y/N]: ");
         char answer = reader.readLine().toUpperCase().charAt(0);
         
         if (answer == 'Y') {
             stocknumberSpecified = true;
             System.out.print("6100 comparison: [<,>]: ");
             fiftyPercentStartTimeCriterion_ComparisonString = reader.readLine();
             System.out.print("50% start time: ");
             fiftyPercentStartTimeCriterion_Value = Integer.parseInt(reader.readLine());
         }*/



        
        boolean manufacturer_specified = false;
        RVmanufacturerAssociation manufacturer = RVmanufacturerAssociation.NONE;

        // Get the associated gaze shift criterion if the user wants to specify it.
        System.out.print("Would you like to specify an associated RV manufacturer criterion? [Y/N]: ");
        char answer = reader.readLine().toUpperCase().charAt(0);
        
        if (answer == 'Y') {
            manufacturer_specified = true;
            System.out.print("associated RV manufacturer value " + RVmanufacturerAssociation.allowedValues() + ": ");
            manufacturer = RVmanufacturerAssociation.lookup(reader.readLine());
        }

        List<RV> foundRVs = inventory.search(
            manufacturer_specified,manufacturer);

            int foundCount = 0;
            for (Iterator<RV> i = foundRVs.iterator(); i.hasNext(); ) {
                RV aFoundRV = i.next();
                foundCount++;
                System.out.print(foundCount + " ");
                System.out.println(aFoundRV);
            }
            if (foundCount == 0) {
                System.out.println(sep + "Sorry, no matching RVs found" + sep);
            }




    }


    private static void initializeInventory(final RVInventory inventory) {
        // stock # manufacturer model price type length weight
        inventory.addRV( "COACHMEN", "Apex 289TBSS", sep, 30975, "Travel Trailer", 25, 5720);
        inventory.addRV( "COACHMEN", "V-Trec VC", sep, 19475, "Popup", 23, 3217);
        inventory.addRV( "COACHMEN", "Leprechaun", sep, 96975, "Class C", 31, 14500);
        inventory.addRV( "TOFFIN", "Allegro", sep, 69900, "Class A", 34, 18621);
        inventory.addRV( "STARCRAFT", "Travel Star", sep, 8900, "Hybrid", 17, 2997);
        inventory.addRV( "XLR", "Hyperlite", sep, 37475, "Toy Hauler", 25, 5322);
        inventory.addRV( "FOREST_RIVER", "Artic Wolf", sep, 31900, "Fifth Wheel", 29, 8131);
        inventory.addRV( "FOUR_WINDS", "Classic", sep, 9900, "Fifth Wheel", 32, 8064);
    }
}
