package MyStack;

import java.util.Stack;

public class maximumAreaOfHistogram {
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int maxArea(int height[]) {

        Stack<Integer> s = new Stack<>();
        int maxArea = 0;

        // Next Smaller Right
        int nsr[] = new int[height.length];
        for (int i = height.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = height.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller Left
        int nsl[] = new int[height.length];
        s = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        print(nsl);
        System.out.println();

        // Max Area
        // width = j - i - 1
        // width = nsr[i] - nsl[i] - 1
        for (int i = 0; i < height.length; i++) {
            int currHeight = height[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = currHeight * width;
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int height[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxArea(height));
    }
}
