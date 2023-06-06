public class Birthday {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);      // Quantidade de dias
        int trials = Integer.parseInt(args[1]); // Quantidade de tentativas
        int[] qtd_pessoas = new int[n + 1]; 

        for (int i = 0; i < trials; i++) {
            int[] bday = new int[n + 1];
            int count_people = 0;
            for (int j = 0; j <= n; j++) {
                int newpeople = (int) (Math.random() * n + 1);
                count_people++;
                bday[newpeople]++;
                if (bday[newpeople] > 1) {
                    qtd_pessoas[count_people]++;
                    break;
                }
            }
        }
        double count = 0.0;
        for (int i = 1; i <= n; i++) {
            count += qtd_pessoas[i];
            double percent = count / trials;

            if (i == 1) System.out.println(i + " 0 " + qtd_pessoas[i]/trials);
            else if (qtd_pessoas[i] > 0) {
                System.out.println(i + " " + count + " " + percent);
            }
            if (percent > 0.50) break;
        }
    }
}