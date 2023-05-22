public class CMYKtoRGB {
  public static void main(String[] args) {

    double C = Double.parseDouble(args[0]); // cyan
    double M = Double.parseDouble(args[1]); // magenta
    double Y = Double.parseDouble(args[2]); // yellow
    double K = Double.parseDouble(args[3]); // black

    int white = (int)(1 - K);
    int red = (int)(255 * white * (1 - C));
    int green = (int)(255 * white * (1 - M));
    int blue = (int)(255 * white * (1 - Y));

    System.out.println("red   = " + red);
    System.out.println("green = " + green);
    System.out.println("blue  = " + blue);

  }
}
