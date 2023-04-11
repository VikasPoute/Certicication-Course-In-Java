package ObjectOrientedProgramming;

public class InterfacesInJava {
    public static void main(String[] args) {
        Queen Q = new Queen();
        Q.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {

    @Override
    public void moves() {
        System.out.println("up, down, right, left, diagonal (in all 4 directions)");

    }
}

class Rook implements ChessPlayer {

    @Override
    public void moves() {
        System.out.println("up, down, right, left");

    }
}

class King implements ChessPlayer {

    @Override
    public void moves() {
        System.out.println("up, down, right, left, diagonal (by 1 step)");

    }
}