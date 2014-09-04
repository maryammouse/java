class Ascii {
    public static void main(String args[])
        throws java.io.IOException {
        char input = (char) System.in.read();
        char changed;
        int changes;
        changes = 0;


        System.out.println(" Hit '.' to end");


        do {
            input = (char) System.in.read();

            if(input >= 'a' & input <='z') {
                changed = input -= 32;
                changes ++ ;

                System.out.print(changed);
            }
            else if(input >= 'A' & input <='Z') {
                changed = input += 32;
                changes ++ ;
                System.out.print(changed);
            }

        } while(input != '.');
        System.out.println("Case changes: " + changes);
    }
}
