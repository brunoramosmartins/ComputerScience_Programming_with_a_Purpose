// import edu.princeton.cs.algs4.StdDraw;
// import edu.princeton.cs.algs4.StdIn;

public class WorldMap {
    public static void main(String[] args) {
        
        int Width = StdIn.readInt();
        int Height = StdIn.readInt();

        StdDraw.setCanvasSize(Width, Height);

        StdDraw.setXscale(0, Width);
        StdDraw.setYscale(0, Height);

        StdDraw.enableDoubleBuffering();

        while (!StdIn.isEmpty()) {

            StdIn.readString();

            int n = StdIn.readInt(); // number of vertices
            double[] vx = new double[n]; // x points
            double[] vy = new double[n]; // y points

            for (int i = 0; i < n; i++) {
                vx[i] = StdIn.readDouble();
                vy[i] = StdIn.readDouble();
            }

            StdDraw.polygon(vx, vy);

        }

        StdDraw.show();
    }
}