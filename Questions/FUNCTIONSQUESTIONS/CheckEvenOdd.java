package Questions.FUNCTIONSQUESTIONS;

public class CheckEvenOdd {

    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 10;

        boolean ans = isEven(n);
        System.out.println(ans);

    }
}
