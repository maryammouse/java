/*
   Chapter 5 Self-Test Question 4
   Demonstrate the Bubble sort.
*/

class NewBubble {
  public static void main(String args[]) {
    String words[] = {"Saffys Angel", "Caddy Ever After", "Permanent Rose", "Forever Rose", "Indigos Star", "Caddys World"};
    int a, b;
    String t;
    int size;

    size = 6; // number of elements to sort

    // display original array
    System.out.print("Original array is:");
    for(String x : words) System.out.print(" " + x);
      System.out.println();

    // This is the bubble sort.
    for(a=1; a < size; a++)
      for(b=size-1; b >= a; b--) {
        if(words[b-1].compareTo(words[b]) > 0) { // if out of order
          // exchange elements
          t = words[b-1];
          words[b-1] = words[b];
          words[b] = t;
        }
      }

    // display sorted array
    System.out.print("Sorted array is:");
    for(String x : words)
      System.out.print(" " + x);
    System.out.println();
  }
}

