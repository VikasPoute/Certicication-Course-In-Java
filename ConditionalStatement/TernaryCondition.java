package ConditionalStatement;

/**
 * TernaryCondition
 */
public class TernaryCondition {

    public static void main(String[] args) {

        int number = 10;

        String type = ((number % 2) == 0) ? "EVEN" : "ODD";
        System.out.println(type);
    }
}