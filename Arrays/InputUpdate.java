package Arrays;

public class InputUpdate {

    public static void main(String[] args) {

        int marks[] = new int[100];

        marks[0] = 99; // phy
        marks[1] = 90; // chem
        marks[2] = 99; // math

        System.out.println("phy: " + marks[0]);
        System.out.println("chem: " + marks[1]);
        System.out.println("math: " + marks[2]);

        marks[1] = marks[1] + 5;

        System.out.println("math update: " + marks[2]);

        int persent = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Total persent: " + persent);
    }
}
