public class Bpart1 {

    public static void main(String[] args) {

        int row = 5;

        for (int x = 1; x <= row; x++) {

            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}