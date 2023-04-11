package Arrays;

public class LargestNumber {
    public static int largestOne(int arr[]) {
        int large = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > large) {
                large = arr[i];
            }
        }

        return large;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 6, 3, 5, 8 };
        int ans = largestOne(arr);
        System.out.println(ans);
    }
}
