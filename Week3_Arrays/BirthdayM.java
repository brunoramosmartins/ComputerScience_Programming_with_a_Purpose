/******************************************************************************
 *  Compilation:  javac BirthdayM.java
 *  Execution:    java BirthdayM days
 *
 *  Computes the number of people (by simulation) that must enter a room
 *  until two of them share a birthday. Assumes birthdays are uniform
 *  and independent from 0 to days-1.
 *
 *  % java BirthdayM 365
 *  25
 *
 *  % java BirthdayM 365
 *  22
 *
 ******************************************************************************/

// Birthday problem. Modify Birthday.java so that it compute the probability that two people have a birthday within a day of each other.

public class BirthdayM {
    public static void main(String[] args) {
        
        int days = Integer.parseInt(args[0]); // number of days
        int  people = 0;                      // total number of people

        // hasBirthday[d] = true is someone born on day d; false otherwise
        // auto-initialized to false
        boolean[] hasBirthday = new boolean[days];

        while(true) {
            people++;
            int d = (int) (days * Math.random()); // integer between 0 and days-1
            if (hasBirthday[d]) break;
            hasBirthday[d] = true;
        }

        System.out.println(people);
    }
}