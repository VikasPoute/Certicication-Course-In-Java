package ConditionalStatement;

public class IfElseCondition {
    public static void main(String[] args) {

        int age = 22;

        if (age >= 18)
            System.out.println("Adult: You can drive, You can vote");
        if (age > 13 && age < 18)
            System.out.println("You are teenager now");
        else
            System.out.println("you are not adult");

    }

}
