package Exercise5;

public class MxAdd {
    public static int[][] matrixAdd(int[][] mx1, int[][] mx2){
        int n = mx1[0].length;
        int m = mx1.length;
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = mx1[i][j]+mx2[i][j];
            }
        }
        return result;
    }
}
