package edu.cnm.deepdive;

/*
    Compute the number if cubic inches in 1 cubic mile.
 */
class Inches {

  public static void main(String args[]) {
    long cubicInches;
    long inchesMile;

    inchesMile = 5280 * 12;

    cubicInches = inchesMile * inchesMile * inchesMile;

    System.out.println("There are " + cubicInches +
        " cubic inches in a cubic mile.");
  }
}
