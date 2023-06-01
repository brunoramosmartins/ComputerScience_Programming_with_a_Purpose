/******************************************************************************
 *  Compilation:  javac MonteHall.java
 *  Execution:    java MonteHall trials
 *
 *  Plays the Monte Hall game the specified number of times with the
 *  switching strategy and reports the fraction of games won.
 *
 *  Sample execution:
 *
 * % java MonteHall 10000000
 * Fraction of games won = 0.666586
 *
 *
 *  Note:  true winning probability = 2/3.
 *
 ******************************************************************************/

public class MonteHall {
    public static void main(String[] args) {

        int trials = Integer.parseInt(args[0]);
        int wins = 0;

        // repeat experiment trials times
        for (int i = 0; i < trials; i++) {

            // host hides prize behind 1 of 3 doors uniformly at random
            int prize = (int) (3 * Math.random());

            // contestant select 1 of 3 doors uniformly at random
            int choice = (int) (3 * Math.random());

            // at random, host reveals an unchosen door not containing prize
            int reveal;
            do {
                reveal = (int) (3 * Math.random());
            } while ((reveal == choice) || (reveal == prize));

            // hack to compute the remaining door which contestent switches to
            int other = 0 + 1 + 2 - reveal - choice;

            // switching leads to a win
            if (other == prize) wins++;
        }

        // avoid.integer division
        System.out.println("Fraction of games won = " + 1.0 * wins / trials);
    }
}