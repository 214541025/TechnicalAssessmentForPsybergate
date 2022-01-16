public class ProblemALG004r {
    public static void main(String[] args) {
        int n = 5;
        if (n % 2 == 0) throw new RuntimeException("n must be odd");

        int[][] magic = new int[n][n];

        int row = 0;
        int col = n/2;
        magic[row][col] = 1;

        for (int i = 2; i <= n*n; i++) {
            if((row-1>=0)){
                if (magic[(row - 1) % n][(col + 1) % n] == 0) {

                    row = (row - 1) % n;
                    col = (col + 1) % n;

                }
                else {
                    row = (row + 1) % n;
                }
            }
            else {
                if((col+1 < n)){
                    row = n - 1;
                    col = (col + 1) % n;
                }
                else{
                    row = n - 1;
                    col = 0;
                }
            }
            magic[row][col] = i;
        }

        // print results
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (magic[i][j] < 10)  System.out.print(" ");  // for alignment
                if (magic[i][j] < 100) System.out.print(" ");  // for alignment
                System.out.print(magic[i][j] + " ");
            }
            System.out.println();
        }

    }
}

