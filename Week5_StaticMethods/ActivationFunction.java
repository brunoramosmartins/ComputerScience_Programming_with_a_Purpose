public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        else if (x <  0) return 0.0;
        else if (x == 0) return 0.5;
        else             return 1.0;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        double sigma = 1 / (1 + Math.exp(-x));
        return sigma;
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        double tanhX = (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
        return tanhX;
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        double softsignX = x / (1 + Math.abs(x));
        return softsignX;
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        else if (x <= -2.0)               return -1.0;
        else if ((x > -2.0) && (x < 0.0)) return x + x*x / 4;
        else if ((x >= 0.0) && (x < 2.0)) return x - x*x / 4;
        else                              return 1;
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        System.out.println("heaviside(" + x + ") = " + heaviside(x));
        System.out.println("  sigmoid(" + x + ") = " + sigmoid(x));
        System.out.println("     tanh(" + x + ") = " + tanh(x));
        System.out.println(" softsign(" + x + ") = " + softsign(x));
        System.out.println("     sqnl(" + x + ") = " + sqnl(x));
    }
}