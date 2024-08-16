package LLD.Concept_And_Coding.L11_Tic_Tac_Toe.Model;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javafx.util.Pair;
import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L11_Tic_Tac_Toe.Model
 * <p>
 * User: piyushbajaj
 * Date: 06/04/23
 * Time: 12:33 pm
 */

@Data
public class S5_Game {
    Deque<S4_Player> playerList;
    S3_Board board;

    public S5_Game() {
        initializeGame();
    }

    public void initializeGame() {
        // creating 2 players
        playerList = new LinkedList<>();
        S2_PlayingPieceX playingPieceX = new S2_PlayingPieceX();
        S4_Player player1 = new S4_Player("Player1", playingPieceX);

        S2_PlayingPieceO playingPieceO = new S2_PlayingPieceO();
        S4_Player player2 = new S4_Player("Player2", playingPieceO);

        playerList.add(player1);
        playerList.add(player2);

        // initialize board
        board = new S3_Board(3);
    }

    public String startGame() {
        boolean noWinner = true;

        while (noWinner) {
            // Get free cells, and return in case there is no free cells
            List<Pair<Integer, Integer>> freeCells = board.getFreeCells();
            if (freeCells.isEmpty()) {
                noWinner = false;
                continue;
            }

            board.printBoard();
            // take out the player whose turn is first
            S4_Player player = playerList.removeFirst();
            // read the user input
            System.out.println(
                player.name + "! Enter your move (" + player.playingPiece.pieceType + ") , i.e., row & col: ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String[] values = s.split(",");

            int inputRow = Integer.parseInt(values[0]);
            int inputCol = Integer.parseInt(values[1]);

            // let's try this move
            boolean moveAdded = board.addPiece(inputRow, inputCol, player.playingPiece);
            if (!moveAdded) {
                // means this move is not available, try something else for same player
                System.out.println("Incorrect move, try some other move");
                playerList.addFirst(player);
                continue;
            }
            // successfully played the move
            playerList.addLast(player);

            // now let's verify if this player won the game
            boolean winner = isWinner(inputRow, inputCol, player.playingPiece);
            if (winner) {
                return player.getName();
            }

        }

        return "Tie";
    }

    /**
     * Verifies is the current player won the game with the current move
     *
     * @param inputRow
     * @param inputCol
     * @param playingPiece
     * @return
     */
    public boolean isWinner(int inputRow, int inputCol, S1_PlayingPiece playingPiece) {
        boolean isRowMatch = true;
        boolean isColMatch = true;
        boolean isDiagonalMatch = true;
        boolean isAntiDiagonalMatch = true;

        // checking if there is row match or not
        for (int i = 0; i < board.size; i++) {
            if (board.board[inputRow][i] == null || board.board[inputRow][i].pieceType != playingPiece.pieceType) {
                isRowMatch = false;
            }
        }

        // checking if there is col match
        for (int i = 0; i < board.size; i++) {
            if (board.board[i][inputCol] == null || board.board[i][inputCol].pieceType != playingPiece.pieceType) {
                isColMatch = false;
            }
        }

        // checking if there is diagonal match
        for (int i = 0, j = 0; i < board.size; i++, j++) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != playingPiece.pieceType) {
                isDiagonalMatch = false;
            }
        }

        // checking if there is anti-diagonal match
        for (int i = 0, j = board.size - 1; i < board.size; i++, j--) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != playingPiece.pieceType) {
                isAntiDiagonalMatch = false;
            }
        }

        return isRowMatch || isColMatch || isDiagonalMatch || isAntiDiagonalMatch;
    }
}
