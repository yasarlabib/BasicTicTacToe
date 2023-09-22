import java.util.*;
public class TicTacToeBoardFace0 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        char player = 'X';
        int rowNum = -1, colNum = -1;
        //making board
        char[][] board = new char[3][3];
        //initialize
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                board[row][col] = '-';
            }
        }
        do { //game keeps running until someone wins
            System.out.println("Printing the board info....");
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[row].length; col++) {
                    System.out.print(board[row][col] + " ");
                }
                System.out.println();
            }
            //player selects the row to place their piece
            System.out.print("Player" + player + ", please select a row number (0-2): ");
            rowNum = input.nextInt();
            //player selects the column to place their piece
            System.out.print("Player" + player + ", please select a column number (0-2): ");
            colNum = input.nextInt();

            System.out.println();

            //if it is valid, make move, update board, show the board
            if (board[rowNum][colNum] == '-') {
                board[rowNum][colNum] = player;
                //check if we have winner
                if((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                        (board[0][0] == player && board[0][1] == player && board[0][2] == player) ||
                        (board[1][0] == player && board[1][1] == player && board[1][2] == player) ||
                        (board[2][0] == player && board[2][1] == player && board[2][2] == player)){
                    System.out.println("Printing the board info....");
                    for (int row = 0; row < board.length; row++) {
                        for (int col = 0; col < board[row].length; col++) {
                            System.out.print(board[row][row] + " ");
                        }
                        System.out.println();
                    }
                    //display when the player win
                    System.out.println(player + " Won!");
                    break;
                }
                else{
                    //both players take turns
                    if(player == 'X') player = 'O';
                    else player = 'X';
                }
            }
        }while(true);


    }
}
