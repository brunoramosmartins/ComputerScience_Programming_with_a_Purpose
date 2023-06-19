// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.StdOut;


public class ShannonEntropy {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int[] freq = new int[m + 1];
        int count = 0;
        double h = 0.0;

        while (!StdIn.isEmpty()) {

            int x = StdIn.readInt();
            freq[x]++;
            count++;
        }
        
        for (int i = 0; i <= m; i++) {
            if (freq[i] != 0) {

                double pi = (double) (freq[i]) / count;
                double piLog = Math.log(pi) / Math.log(2);
                h -= pi * piLog;
                
             }
        }
        
        StdOut.print(h);

    }
}