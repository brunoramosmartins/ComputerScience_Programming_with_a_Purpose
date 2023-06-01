public class Cos {
    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);

        x = x % (2 * Math.PI);

        double sum = 1;
        double term = 1;

        for (int n = 1; term != 0; n++) {
            term *= x / n;
            if (n % 4 == 2) sum -= term;
            if (n % 4 == 0) sum += term;
        }
        System.out.println(sum);
    }
}