package Recursion;

public class DecresingOrder {
    public static void decrisingNumbers(int n) {
        if(n == 0)
            return;
        
        System.out.print(n + " ");
        decrisingNumbers(n - 1);
    }

    public static void main(String[] args) {
        decrisingNumbers(10);
    }
}
