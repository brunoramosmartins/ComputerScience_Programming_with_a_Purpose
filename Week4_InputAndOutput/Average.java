import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Average {
    public static void main(String[] args) {

        double sum = 0.0;   // cumulative total
        int n = 0;          // number of values
        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble();
            sum += x;
            n++;
        }
        StdOut.println(sum / n);
    }
}