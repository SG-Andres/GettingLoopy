public class Bpart2 {

    public static void main(String[] args) {

        int row = 5;

        for (int x = row; x >= 1; x--) {

            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}