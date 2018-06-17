package edu.cnm.deepdive;

/*
  Try This 2-1
  Compute the distance to a lighting
  strike whose sound takes 7.2 seconds
  to reach you.
  Extra challenge to implement echo completed.
 */
public class Sound {

  public static void main(String args[]) {
    double dist, echo;

    dist = 7.2 * 1100;
    echo = (7.2 / 2) * 1100;

    System.out.println("the Lightning is " + dist + " feet away.");
    System.out.println("the Object is " + echo + " feet away.");
  }
}
