/******************************************************************************
 *  Compilation:  javac Gaussian.java
 *  Execution:    java Gaussian x mu sigma
 *
 *  Function to compute the Gaussian pdf (probability density function)
 *  and the Gaussian cdf (cumulative density function)
 *
 *  % java Gaussian 820 1019 209
 *  0.17050966869132111
 *
 *  % java Gaussian 1500 1019 209
 *  0.9893164837383883
 *
 *  % java Gaussian 1500 1025 231
 *  0.9801220907365489
 *
 *  The approximation is accurate to absolute error less than 8 * 10^(-16).
 *  Reference: Evaluating the Normal Distribution by George Marsaglia.
 *  http://www.jstatsoft.org/v11/a04/paper
 *
 ******************************************************************************/

// PDF: A abreviação 'PDF' significa "Probability Density Function" (função de densidade de Probabilidade)
// É uma função matemática que descreve a probabilidade relativa de uma variável aleatória tomar um valor
// específico. No contexto da distribuição normal, a PDF é uma curva em forma de sino que descreve a distribuição
// da probabilidade dos valores da variável aleatória.

import edu.princeton.cs.algs4.*;

public class Gaussian {
    
    // return pdf(x) = standard Gaussian pdf
    /************************************************************************************************
     * A função está retornando a função de densidade de probabilidade padrão da distribuição normal. 
     * Isso significa que ela calcula a probabilidade relativa de um determinado valor "x" ocorrer na 
     * distribuição normal padrão, que tem média 0 e desvio padrão 1.
     ************************************************************************************************/
    public static double pdf(double x) {
        return Math.exp(-x*x / 2) / Math.sqrt(2 * Math.PI);
    }

    // return pdf(x, mu, sigma = Gaussian pdf with mean mu and stddev sigma)
    /************************************************************************************************
     * A função está retornando a função de densidade de probabilidade da distribuição normal com média
     * "mu" e desvio padrão "sigma". Ou seja, ela calcula a probabilidade relativa de um determinado valor
     * "x" ocorrer na distribuição normal com os parâmetros de média e desvio padrão especificados.
     ************************************************************************************************/
    public static double pdf(double x, double mu, double sigma) {
        return pdf((x - mu) / sigma) / sigma;
    }

    // return cdf(z) = standard Gaussian cdf using Taylor approximation
    public static double cdf(double z) {
        if (z < -8.0) return 0.0;
        if (z >  8.0) return 1.0;
        double sum = 0.0, term = z;
        for (int i = 3; sum + term != sum; i += 2) {
            sum  = sum + term;
            term = term * z * z / i;
        }
        return 0.5 + sum * pdf(z);
    }

    // return cdf(z, mu, sigma) = Gaussian cdf with mean mu and stddev sigma
    public static double cdf(double z, double mu, double sigma) {
        return cdf((z - mu) / sigma);
    }

    // Compute z such that cdf(z) = y via bisection search
    public static double inverseCDF(double y) {
        return inverseCDF(y, 0.00000001, -8, 8);
    }

    // bisection search
    private static double inverseCDF(double y, double delta, double lo, double hi) {
        double mid = lo + (hi - lo) / 2;
        if (hi - lo < delta) return mid;
        if (cdf(mid) > y) return inverseCDF(y, delta, lo, mid);
        else              return inverseCDF(y, delta, mid, hi);
    }

    // return phi(x) = standard Gaussian pdf
    @Deprecated
    public static double phi(double x) {
        return pdf(x);
    }

    // return phi(x, mu, sigma) = Gaussian pdf with mean mu and stddev sigma
    @Deprecated
    public static double phi(double x, double mu, double sigma) {
        return pdf(x, mu, sigma);
    }

    // return Phi(z) = standard Gaussian cdf using Taylor approximation
    @Deprecated
    public static double Phi(double z) {
        return cdf(z);
    }

    // return Phi(z, mu, sigma) = Gaussian cdf with mean mu and stddev sigma
    @Deprecated
    public static double Phi(double z, double mu, double sigma) {
        return cdf(z, mu, sigma);
    }

    // Compute z such that Phi(z) = y via bisection search
    @Deprecated
    public static double PhiInverse(double y) {
        return inverseCDF(y);
    }

    // test client
    public static void main(String[] args) {
        double z     = Double.parseDouble(args[0]);
        double mu    = Double.parseDouble(args[1]);
        double sigma = Double.parseDouble(args[2]);
        StdOut.println(cdf(z, mu, sigma));
        double y = cdf(z);
        StdOut.println(inverseCDF(y));
    }


}