package Arrays;

public class KadanceAlog {
    public static void kadance(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                maxSum = Math.max(maxSum, arr[i]);
            } else {
                currSum += arr[i];
                if (currSum < 0) {
                    currSum = 0;
                }

                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println("The maximum sub array sum is: " + maxSum);
    }

    public static void main(String[] args) {

        int arr[] = { -2, -3, -4, -1, -2, -1, -5, -3 };

        kadance(arr);
    }
}
