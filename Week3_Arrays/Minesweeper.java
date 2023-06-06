public class Minesweeper {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[1]);

        char[][] grid = new char[m][n];

        int count = 0;
        while (count < k) {
            int randM = (int) (Math.random() * m);
            int randN = (int) (Math.random() * n);
            if (grid[randM][randN] != '*') {
                grid[randM][randN] = '*';
                count++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
    }
}