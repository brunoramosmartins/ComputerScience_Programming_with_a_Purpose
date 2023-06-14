import edu.princeton.cs.algs4.*;

public class ShannonEntropy {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int[] seq = new int[m + 1];
        double[] prop = new double[m + 1];

        while (!StdIn.isEmpty()) {

            int x = StdIn.readInt();
            seq[x]++;
        }
        double sum = 0.0;
        for (int i = 0; i <= m; i++) {
            prop[i] = (-1) * (double) (seq[i] / m) * (Math.log(seq[i] / m) / Math.log(2));
            sum += prop[i];
        }
        System.out.println(sum);

    }
}