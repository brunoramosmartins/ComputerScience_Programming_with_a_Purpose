/******************************************************************************
 *  Compilation:  javac Stats5.java
 *  Execution:    java Stats5
 *
 *  Generate and print 5 random values between 0.0 and 1.0, and print
 *  their average value, min value, and max value.
 *
 *  % java Stats5
 *
 *  0.7203537279117841
 *  0.09574435157738448
 *  0.8979741693231866
 *  0.11949032184355113
 *  0.23425519545397544
 *  Average = 0.4135635532219763
 *  Min     = 0.09574435157738448
 *  Max     = 0.8979741693231866
 *
 *  % java Stats5
 *  0.25523821773554134
 *  0.6577131932424987
 *  0.14170223533941984
 *  0.2653444869526621
 *  0.895374957216799
 *  Average = 0.44307461809738424
 *  Min     = 0.14170223533941984
 *  Max     = 0.895374957216799
 *
 ******************************************************************************/

public class Stats5 {
  public static void main(String[] args) {

    int    n  = 5;
    double n1 = Math.random();
    double n2 = Math.random();
    double n3 = Math.random();
    double n4 = Math.random();
    double n5 = Math.random();

    // Compute stats
    double average = (n1 + n2 + n3 + n4 + n5) / n;
    double min     = Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, n5))));
    double max     = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));

    // Print 5 value
    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n3);
    System.out.println(n4);
    System.out.println(n5);

    System.out.println("Average = " + average);
    System.out.println("Min     = " + min);
    System.out.println("Max     = " + max);
  }
}
