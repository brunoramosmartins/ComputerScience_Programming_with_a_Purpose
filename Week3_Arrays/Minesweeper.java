public class Minesweeper {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

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

                if (grid[i][j] != '*') {
                    grid[i][j] = (char) 0;
                    int countbomb = 0; 
                    for (int a = 0; a <= 2; a++) {
                        for (int b = 0; b <= 2; b++) {
                            if ((i + a - 1) >= 0 && (i + a - 1) < m && (j + b - 1) >= 0 && (j + b - 1) < n) {
                                if (grid[i + a - 1][j + b - 1] == '*') {
                                    countbomb++;
                                }
                            }
                        }
                    }
                    grid[i][j] = Character.forDigit(countbomb, 10);
                    
                }
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
    }
}