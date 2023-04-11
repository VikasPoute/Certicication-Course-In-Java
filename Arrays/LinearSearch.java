package Arrays;

public class LinearSearch {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void stringSearch(String stringsArray[], String find) {

        boolean flag = false;
        int k = 0;

        for (int i = 0; i < stringsArray.length; i++) {
            if (stringsArray[i] == find) {
                k = i;
                flag = true;
            }
        }

        if (flag) {
            System.out.println("Found at: " + k);
        } else {
            System.out.println("Not Found");
        }
    }

    public static void main(String[] args) {

        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at: " + index);
        }

        String stringsArray[] = { "Samosa", "Dosa", "chole bhature" };
        String find = "Dosa";

        stringSearch(stringsArray, find);
    }
}
