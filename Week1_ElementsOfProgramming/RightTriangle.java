public class RightTriangle {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    boolean retangulo;
    boolean positivo;

    retangulo = ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (a * a + c * c == b * b));
    positivo = ((a > 0) && (b > 0) && (c > 0));

    System.out.println(retangulo && positivo);

  }
}
