package Exercise2;

public class ArrayReverse {
    public static void reverse(int[] arr) {
        int n = arr.length;
        System.out.printf("Array = [");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf(arr[i] + ",");
        }
        System.out.printf(arr[n - 1] + "]\n");
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.printf("Reversed Array = [");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf(arr[i] + ",");
        }
        System.out.printf(arr[n - 1] + "]");
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
    }
}
