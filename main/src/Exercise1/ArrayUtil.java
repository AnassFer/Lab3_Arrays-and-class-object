package Exercise1;

public class ArrayUtil {
    public static int[] sortIntegers(int[] arr){
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int max_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if( res[max_i] <res [j]){
                    max_i = j;
                }
            }
            int temp = res[i];
            res[i] = res[max_i];
            res[max_i] = temp;

        }
        return res;
    }
    public static void printArray(int[] arr){
        int i = 0;
        for( int num : arr){
            System.out.println("Element " + i +" contents " + num);
            i++;
        }
    }
    public static void main(String[] args){
        int[] arr = {106, 26, 81, 5, 15};
        printArray(sortIntegers(arr));
    }
}
