package lesson5.task_2;

public class ChessboardSetup {
    char [][] array = new char[8][8];

    ChessboardSetup(){
        initializeChessboard();
        printChessboard();
    }

    private void initializeChessboard(){
for (int row = 0; row < 8; row++){
    for (int col = 0; col < 8; col++){
        array[row][col] = (row + col) % 2 == 0 ? 'W' : 'B';
    }
}
    }
    private void printChessboard (){
        System.out.println("Your chessboard:");
        for (char[] row : array) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    }


