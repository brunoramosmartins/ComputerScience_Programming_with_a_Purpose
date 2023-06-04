public class ThueMorse {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int[] sequence = { 0 };

        while (sequence.length < n) {
            
            // copy and pattern apply
            int[] temp = new int[sequence.length];
            for (int i = 0; i < temp.length; i++) {
                if (sequence[i] == 0) temp[i] = 1;
                else if(sequence[i] == 1) temp[i] = 0;
            }
            
            // append list
            int[] temp2 = new int[2 * sequence.length];
            for (int i = 0; i < temp2.length; i++) {
                if (i < temp.length) {
                    temp2[i] = sequence[i];
                }
                else {
                    temp2[i] = temp[i - sequence.length];
                }
            }

            // refresh sequence
            sequence = new int[temp2.length];
            for (int i = 0; i < sequence.length; i++) {
                sequence[i] = temp2[i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sequence[i] == sequence[j]) {
                    System.out.print("+  ");
                }
                else if (sequence[i] != sequence[j]) {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}