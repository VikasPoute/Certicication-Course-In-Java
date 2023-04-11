package BackTracking;

public class test {
    public static int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        result[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int prod = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * prod;
            prod = prod * nums[i];
        }

        return result;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 4 };
        int ans[] = productExceptSelf(nums);
        printArr(ans);
    }
}
