package VariablesAndDataTypes;

/**
 * TypeCasting
 */
public class TypeCasting {

    public static void main(String[] args) {

        float f = 25.25f;
        // int t = f; This is not allowed

        int t = (int) f; // Allowed but loss data
        System.out.println(t);

        char ch = 'a';

        int a = ch;

        System.out.println(a);
    }
}