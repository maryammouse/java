/* following the example of
 * Try This 1-2
 * which creates a gallons to liters conversion table
 */

class InchesToMetersTable {
    public static void main(String args[]) {
        double inches, meters;
        int counter;

        counter = 0;

        for(inches = 1; inches <= 144; inches++) {
            meters = inches * 2.54; // convert to meters
            System.out.println(inches + " inches is " +
                            meters + " meters.");
            counter++;
            if(counter == 12) {
                System.out.println();
                counter = 0; // reset the line counter
                }
        }
    }
}
