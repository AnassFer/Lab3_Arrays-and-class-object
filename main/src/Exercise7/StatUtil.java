package Exercise7;

public class StatUtil {
    public static double stdev(int[] arr){
        int sum = 0;
        for (int num:arr) {sum+=num;}
        double avg = (double) sum / arr.length;
        double sum1=0;
        for (int num:arr) {sum1+=Math.pow((num-avg), 2);}
        return Math.sqrt(sum1/(arr.length-1));
    }

    public static void main(String[] args) {
        System.out.println(stdev(new int[]{1, -2, 4, -4, 9, -6, 16, -8, 25, -10}));
    }
}
