public class RandomWalker {
  public static void main(String[] args) {

    // Ponto incial
    int x0 = 0;
    int y0 = 0;

    // Distancia e quantidade de passos
    int r     = Integer.parseInt(args[0]);
    int steps = 0;

    double dist = Math.sqrt(x0*x0 + y0*y0);
    double prob;

    System.out.println("( " + x0 + ", " + y0 + ")");
    
    while(dist < r){
      prob = Math.random();
      if (prob < 0.25) x0++;
      if (0.25 <= prob && prob < 0.50) x0--;
      if (0.50 <= prob && prob < 0.75) y0++;
      if (0.75 <= prob) y0--;

      dist = Math.sqrt(x0 * x0 + y0 * y0);
      steps++;
      System.out.println("( " + x0 + ", " + y0 + ")");
    }
    System.out.println("step = " + steps);
  }
}
