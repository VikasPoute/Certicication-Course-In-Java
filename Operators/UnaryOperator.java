package Operators;

/**
 * UnaryOperator
 */
public class UnaryOperator {

    public static void main(String[] args) {

        // Pre Increment
        int a = 10;
        int b = ++a;

        System.out.println("Pre Increment");
        System.out.println(a);
        System.out.println(b);

        // Post Increment
        int x = 10;
        int y = x++;

        System.out.println("Post Increment");
        System.out.println(x);
        System.out.println(y);

        // Pre Decrement
        int p = 10;
        int q = --p;

        System.out.println("Pre Decrement");
        System.out.println(p);
        System.out.println(q);

        // Post Decrement

        int n = 10;
        int m = n--;

        System.out.println("Post Decrement");
        System.out.println(n);
        System.out.println(m);
    }
}