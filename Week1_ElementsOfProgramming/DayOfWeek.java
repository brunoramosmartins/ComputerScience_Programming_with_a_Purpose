/******************************************************************************
 *  Compilation:  javac DayOfWeek.java
 *  Execution:    java DayOfWeek m d y
 *
 *  Read in the month (m), day (d), and year (y) and print out what
 *  day of the week it falls on according to the Gregorian calendar.
 *  For M use 1 for January, 2 for February, and so forth. Outputs
 *  0 for Sunday, 1 for Monday, and so forth.
 *
 *        y0 = y - (14 - m) / 12
 *        x = y0 + y0/4 - y0/100 + y0/400
 *        m0 = m + 12 * ((14 - m) / 12) - 2
 *        d = (d + x + (31*m0)/12) mod 7
 *
 *
 *  % java DayOfWeek 8 2 1953      // August 2, 1953
 *  0                              // Sunday
 *
 *  % java DayOfWeek 1 1 2000      // January 1, 2000
 *  6                              // Saturday
 *
 ******************************************************************************/

public class DayOfWeek {
  public static void main(String[] args) {

    int month = Integer.parseInt(args[0]);
    int day   = Integer.parseInt(args[1]);
    int year  = Integer.parseInt(args[2]);

    int y_0 = year - (14 - month) / 12;
    int x   = y_0 + y_0 / 4 - y_0 / 100 + y_0 / 400;
    int m_0 = month + 12 * ((14 - month) / 12) - 2;
    int d_0 = (day + x + 31 * m_0 / 12) % 7;

    System.out.println(d_0);
  }
}
