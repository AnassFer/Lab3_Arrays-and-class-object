package Exercise6;

public class ArrayMedian {
    public static int median(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int realIndex = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) continue;
                else{
                    if(arr[j] < arr[i]) realIndex++;
                }
            }
            if (realIndex == (arr.length-1)/2) return arr[i];
        }
        return -1;

    }
    public static void main(String[] args){
        int[] arr = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        System.out.println(median(arr));
    }
}
