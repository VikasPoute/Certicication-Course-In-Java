package ObjectOrientedProgramming;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created Pen object called object p1

        p1.setColor("Red");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Vikas Poute";
        // myAcc.password = "abcdefghijk"; // This is not allowed
        myAcc.setPassword("abcde"); // This is allowed
    }
}

class BankAccount {
    public String userName;
    public void setPassword(String pwd) {
    }

}

class Pen {
    private String color;
    private int tip;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

}
