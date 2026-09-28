package Exercise3;

public class ArrayBuild {
    public static int[][] build(){
        int[][] result2d = new int[5][];
        int track = 1;
        for (int i = 1; i < 6; i++) {
            int[] result1d = new int[i];
            for (int j = track; j < track + i; j++) {
                result1d[j - track] = j;
            }
            track = result1d[i-1]+1;
            result2d[i-1] = result1d;
        }
        return result2d;
    }
    public static void main(String[] args){
        int[][] arr = build();
        for(int[] row : arr){
            for(int num:row){
                System.out.printf(num + " ");
            }
            System.out.printf("\n");
        }
    }
}
