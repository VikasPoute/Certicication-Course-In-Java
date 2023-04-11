package MyStack;

import java.util.Stack;

public class StockSpan {

    public static void stockSpan(int span[], int stock[]) {

        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stock.length; i++) {
            int curr = stock[i];

            while (!s.isEmpty() && curr > stock[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prvHigh = s.peek();
                span[i] = i - prvHigh;
            }

            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stock.length];

        stockSpan(span, stock);
        // stock(span, stock);

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
