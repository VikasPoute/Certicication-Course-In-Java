package Arrays;

public class SubArraysSum {

    public static void usingPrefixSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefixArray[] = new int[arr.length];

        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prefixArray[j] : prefixArray[j] - prefixArray[i - 1];
                maxSum = Integer.max(maxSum, currSum);
            }
        }

        System.out.println(maxSum);
    }

    public static void subArraySum(int arr[]) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];

                    min = Integer.min(min, currSum);
                    max = Integer.max(max, currSum);
                }
                System.out.print(currSum + " ");
            }

            System.out.println();
        }

        System.out.println("The minimum sum of subarry is: " + min);
        System.out.println("The maximum sum of subarry is: " + max);
    }

    public static void main(String[] args) {

        int arr[] = { 1, -2, 6, -1, 3 };
        // subArraySum(arr);
        usingPrefixSum(arr);
    }
}
