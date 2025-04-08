import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[i] += arr[i];  
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
