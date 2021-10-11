package random_challenges;

import java.util.Arrays;

public class HourGlassMatrix {

    public static void main(String[] args) {
        int k = 0;
        int[] sum = new int[16];
        int[][] matrix = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        sumOfArray(k, sum, matrix);
    }

    private static void sumOfArray(int k, int[] sum, int[][] matrix) {
        int r;
        int c;
        for (r = 0; r < 4; r++) {
            for (c = 0; c < 4; c++) {
                sum[k] = matrix[r][c] + matrix[r][c + 1] + matrix[r][c + 2]
                        + matrix[r + 1][c + 1]
                        + matrix[r + 2][c] + matrix[r + 2][c + 1] + matrix[r + 2][c + 2];
                k++;
            }
        }
        Arrays.sort(sum);
        System.out.println(sum[15]);
    }
}
