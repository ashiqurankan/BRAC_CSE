import java.util.*;

public class sol10{

    public static void updatedPosition(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int matrix[][] = {
            {0, 0, 10, 0, -1},
            {0, -1, 0, 0, -1},
            {-1, 0, -1, 0, 0},
            {0, -1, 7, 0, -1},
            {0, -1, 0, -1, 0}
        };

        int moves = 5;

        int playerRow = 3, playerCol = 2;

        System.out.println("Now:");
        updatedPosition(matrix);

        boolean gameWon = false;

        for (int i = 1; i <= moves; i++){
            System.out.print("Enter move " + i + " (UP, DOWN, LEFT, RIGHT): ");
            String move = sc.next().toUpperCase();

            int newRow = playerRow;
            int  newCol = playerCol;

            if (move.equals("UP")){
                newRow--;
            } else if (move.equals("DOWN")){
                newRow++;
            } else if (move.equals("LEFT")){
                newCol--;
            } else if (move.equals("RIGHT")){
                newCol++;
            } else {
                System.out.println("Invalid move. Try again.");
                i--; 
                continue;
            }

            if (newRow < 0 || newRow >= matrix.length || newCol < 0 || newCol >= matrix[0].length){
                System.out.println("Player fell outside the playing area. Game over!");
                break;
            }

        
            if (matrix[newRow][newCol] == -1){
                System.out.println("Player stepped on a mine. Game over!");
                break;
            } else if (matrix[newRow][newCol] == 10){
                System.out.println("Treasure found. You win!");
                gameWon = true;
                matrix[playerRow][playerCol] = 0;
                matrix[newRow][newCol] = 7;
                break;
            }

            matrix[playerRow][playerCol] = 0;
            playerRow = newRow;
            playerCol = newCol;
            matrix[playerRow][playerCol] = 7;

            System.out.println("Current state:");
            updatedPosition(matrix);
        }

        if (!gameWon && moves > 0) {
            System.out.println("Out of moves, Game over!");
        }

    }


}
