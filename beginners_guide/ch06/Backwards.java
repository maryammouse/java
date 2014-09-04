class Backwards {
    String Backwards(String stringy) {
        if(stringy.length() == 0) return "";
        int index1 = 1;
        int index2 = stringy.length() - 2;
        char last = stringy.charAt(0);
        char first = stringy.charAt(stringy.length() - 1);

        String NewString = first + Backwards(stringy.substring(index1, index2)) + last;
        return NewString;


    }

}

