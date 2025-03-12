package BM23AI098;
public class chessboard{

    public static void printChessboard(int rows, int cols) {

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("W ");
                } else {
                    System.out.print("B ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 8;
        int cols = 8;


        printChessboard(rows, cols);
    }
}