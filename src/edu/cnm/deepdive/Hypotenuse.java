package edu.cnm.deepdive;

/*
  Use the Pythagorean theorem to find
  the length of the hypotenuse given
  the lengths of the two opposing sides.
 */
class Hypotenuse {

  public static void main(String[] args) {
    double x, y, z;

    x = 3;
    y = 4;

    z = Math.sqrt(x * x + y * y);

    System.out.println("edu.cnm.deepdive.Hypotenuse is " + z);
  }
}
