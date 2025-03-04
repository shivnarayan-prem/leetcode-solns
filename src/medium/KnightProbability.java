package medium;

public class KnightProbability {

    static int[][] dir = {{-2, -1}, {-1, -2}, {-2, 1}, {1, -2}, {-1, 2}, {2, -1}, {1, 2}, {2, 1}};
    static Double[][][] dp;
    public static double knightProbability(int n, int k, int row, int column) {
        dp = new Double[n + 1][n + 1][k + 1];
        return countValidPaths(n, k, row, column);
    }

    public static double countValidPaths(int n, int k, int row, int column) {
        if(row < 0 || column < 0 || row >= n || column >= n)
            return 0;
        if(k == 0)
            return 1;
        if(dp[row][column][k] != null)
            return dp[row][column][k];

        double cnt = 0;
        for(int i = 0; i < 8; i++)
            cnt += countValidPaths(n, k - 1, row + dir[i][0], column + dir[i][1]) / 8.0;
        return dp[row][column][k] = cnt;
    }

       

    public static void main(String[] args) {
        int row = 3;
        int column = 2;
        int k = 5;
        int n = 4;
        System.out.println(knightProbability(n, k, row, column));

    }
}
