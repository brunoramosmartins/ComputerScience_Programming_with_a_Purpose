/******************************************************************************
 *  Compilation:  javac Permutation.java
 *  Execution:    java Permutation n
 *
 *  Prints a pseudorandom permution of the integers 0 through n-1.
 *
 *    % java Shuffle 6
 *    5 0 2 3 1 4
 *    . * . . . .
 *    . . . . * .
 *    . . * . . .
 *    . . . * . .
 *    . . . . . *
 *    * . . . . .
 *
 ******************************************************************************/

public class Permutation {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];

        // insert integers 0..n-1
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }

        // shuffle
        for (int i = 0; i < n; i++) {
            int r = (int) (Math.random() * (1+i)); // int between 0 and i
            int swap = a[r];
            a[r] = a[i];
            a[i] = swap;
        }

        // print permutation
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");

        // print checkerboard visualization
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] == i) System.out.print("* ");
                else           System.out.print(". ");
            }
            System.out.println("");
        }
    }
}

// Minha tentativa de solução, contudo não gera a primeira linha com números distintos
// public class Permutation {
//     public static void main(String[] args) {

//         int n = Integer.parseInt(args[0]);
//         int[][] matrix = new int[n+1][n];

//         for (int j = 0; j < n; j++) {
//             matrix[0][j] = (int) (Math.random() * n);
//             System.out.print(matrix[0][j] + " ");
//         }
//         System.out.println();       
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i == matrix[0][j]) System.out.print("* ");
//                 else                   System.out.print(". ");
//             }
//             System.out.println();

//         }
//     }
// }