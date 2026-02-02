// Q : Given an integer array of size N, in one second you can increase the value of one element by 1.
// Find the minimum time in seconds to make all the element equal.

// Observation : to minimise the time, we should make all elements equal to the maximum element in the array.

// Pseudo code : 1. Find the maximum element in the array.
// 2. For every element, calculate how much it needs to be increased to reach the maximum.
// 3. Sum all those differences.
 
public class MinTime {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 4};
        // int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // int[] arr = {-2, 5, -3, -1, -4};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (max - arr[i]);
        }
        System.out.println(sum);
    }
}
