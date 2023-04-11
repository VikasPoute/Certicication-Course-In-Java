/*
 * Question 1:Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct. 
 * 
 * Example 1:Input:nums = [1, 2, 3, 1]
 * Output:   true 
 * Example 2:Input:nums = [1, 2, 3, 4]
 * Output:   false 
 * Example 3:Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
 * Output:   true   
 * 
 * Constraints:
 * •1 <= nums .  
 * lengtth <= 105•-109 <= nums [ i ] <= 109 
 */
package Questions.Arrays;

import java.util.Arrays;

public class Q1 {
    public static boolean isPresent(int arr[]) {
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 1 };
        boolean ans = isPresent(arr);
        System.out.println(ans);
    }
}
