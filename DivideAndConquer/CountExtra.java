package DivideAndConquer;

public class CountExtra {
    public static int countExtraElements(int arr[]) {
        int mCount = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > mCount) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = countExtraElements(arr);

        System.out.println(ans);
    }
}
