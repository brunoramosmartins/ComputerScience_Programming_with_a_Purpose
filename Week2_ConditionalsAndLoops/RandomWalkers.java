public class RandomWalkers {
  public static void main(String[] args) {
    // Ponto incial
    int x0 = 0;
    int y0 = 0;

    // Distancia e quantidade de passos
    int r      = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);
    int steps  = 0;

    double dist = 0;
    double prob;
    double median;

    for(int i = 0; i <= trials; i++){

      while(dist < r){
        prob = Math.random();
        if (prob < 0.25) x0++;
        if (0.25 <= prob && prob < 0.50) x0--;
        if (0.50 <= prob && prob < 0.75) y0++;
        if (0.75 <= prob) y0--;

        dist = Math.sqrt(x0 * x0 + y0 * y0);
        steps++;
        }

      x0   = 0;
      y0   = 0;
      dist = 0;
    }

   median = steps / (double) trials;
   System.out.println("average number of steps = " + median);
  }
}
