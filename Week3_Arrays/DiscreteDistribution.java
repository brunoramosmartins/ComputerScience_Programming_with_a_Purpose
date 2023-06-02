public class DiscreteDistribution {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        int sum = 0;

        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(args(i + 1));
            sum += sequence[i];
        }

        for (int i = 0; i < m; i++) {
            int rand = (int) (Math.random() * sum);
            System.out.print()
        }
    }
}