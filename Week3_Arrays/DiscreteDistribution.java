public class DiscreteDistribution {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        int sum = 0;

        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(args[i + 1]);
            sum += sequence[i];
        }

        for (int i = 0; i < m; i++) {
            int rand = (int) (Math.random() * sum);
            int j;
            int temp = 0;
            for (j = 0; j < n; j++) {
                if (temp <= rand && rand < temp + sequence[j]) {
                    System.out.print((j + 1) + " ");
                    break;
                }
                temp += sequence[j];
            }
        }
    }
}