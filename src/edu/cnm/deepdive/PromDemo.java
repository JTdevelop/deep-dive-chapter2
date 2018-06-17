package edu.cnm.deepdive;

// A promotion surprise!
class PromDemo {

  public static void main(String[] args) {
    byte b;
    int i;

    b = 10;
    i = (byte) (b * b); // cast needed!!

    System.out.println("i and b: " + i + " " + b);
  }
}
