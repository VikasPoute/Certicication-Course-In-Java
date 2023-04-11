package StringS;

public class ShortestPath {

    public static double getShortestPath(String str) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);

            if (dir == 'S')
                y--;
            else if (dir == 'N')
                y++;
            else if (dir == 'E')
                x--;
            else
                x++;
        }

        return Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";

        System.out.println(getShortestPath(str));
    }
}
