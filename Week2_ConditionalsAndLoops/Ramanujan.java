/******************************************************************************
 *  Compilation:  javac Ramanujan.java
 *  Execution:    java Ramanujan n
 *
 *  Prints out any number between 1 and n that can be expressed as the
 *  sum of two cubes in two (or more) different ways.
 *
 *  % java Ramanujan 1728
 *
 *  % java Ramanujan 1729
 *  1729 = 1^3 + 12^3 = 9^3 + 10^3
 *
 *  % java Ramanujan 10000
 *  1729 = 1^3 + 12^3 = 9^3 + 10^3
 *  4104 = 2^3 + 16^3 = 9^3 + 15^3
 *
 *  % java Ramanujan 100000
 *  1729 = 1^3 + 12^3 = 9^3 + 10^3
 *  4104 = 2^3 + 16^3 = 9^3 + 15^3
 *  13832 = 2^3 + 24^3 = 18^3 + 20^3
 *  39312 = 2^3 + 34^3 = 15^3 + 33^3
 *  46683 = 3^3 + 36^3 = 27^3 + 30^3
 *  32832 = 4^3 + 32^3 = 18^3 + 30^3
 *  40033 = 9^3 + 34^3 = 16^3 + 33^3
 *  20683 = 10^3 + 27^3 = 19^3 + 24^3
 *  65728 = 12^3 + 40^3 = 31^3 + 33^3
 *  64232 = 17^3 + 39^3 = 26^3 + 36^3
 *
 *  % java Ramanujan 100000000 | sort -n   // sort results numerically in Unix
 *  1729 = 1^3 + 12^3 = 9^3 + 10^3
 *  ...
 *  87539319 = 167^3 + 436^3 = 228^3 + 423^3
 *  87539319 = 167^3 + 436^3 = 255^3 + 414^3
 *  87539319 = 228^3 + 423^3 = 255^3 + 414^3
 *  ...
 *
 *  Bugs
 *  ----
 *  If a number can be expressed as a sum of cubes in more than two
 *  different ways, the program prints some duplicates.
 *
 ******************************************************************************/

public class Ramanujan {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        for (int i = 1; i * i * i <= n; i++) {
            for (int j = i + 1; j * j * j <= n; j++) {
                for (int k = i + 1; k * k * k <= n; k++ ) {
                    for (int l = k + 1; l * l * l <= n; l++) {
                        
                        int cubei = i * i * i;
                        int cubej = j * j * j;
                        int cubek = k * k * k;
                        int cubel = l * l * l;

                        if (cubei + cubej == cubek + cubel) {
                            int cubesum = cubei + cubej;
                            System.out.println(cubesum + " = " + i + "^3 + " + j + "^3 = " + k + "^3 + " + l + "^3");
                        }
                    }
                }
            }
        }
    }
}