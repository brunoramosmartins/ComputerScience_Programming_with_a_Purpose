public class ThueMorse {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int[] sequence = new int[n * n];

        // criar uma função que recebe um array e troca 0 por 1 e 1 por 0
        // pensar no case base e fazer uma recursão.

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sequence[i + j] == 0) {
                    System.out.print("+  ");
                }
                else if (sequence[i + j] == 1) {
                    System.out.print("-  ");
                }
                else {
                    System.out.print("");
                    System.out.println("Erro na sequência.");
                }
            }
            System.out.println();
        }
    }
}