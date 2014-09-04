class Period {
    public static void main(String args[])
        throws java.io.IOException {


        char input;
        int counter = 0;

        input= (char) System.in.read();

        while(input != '.') {
            input = (char) System.in.read();
            if(input  == ' ') counter++;
            if(input == '.') {
                System.out.println("Correct! Spaces counted:" + counter);
                break;
            }
        }
    }
}

