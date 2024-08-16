package LLD.Concept_And_Coding.L11_Tic_Tac_Toe.Model;

import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;
import lombok.Data;


/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L11_Tic_Tac_Toe.Model
 * <p>
 * User: piyushbajaj
 * Date: 06/04/23
 * Time: 12:19 pm
 */

@Data
public class S3_Board {
    int size;
    S1_PlayingPiece[][] board;

    S3_Board(int size) {
        this.size = size;
        board = new S1_PlayingPiece[size][size];
    }


    /**
     * Once player plays, it will check and add the Piece
     *
     * @param row
     * @param col
     * @param playingPiece
     * @return
     */
    public boolean addPiece(int row, int col, S1_PlayingPiece playingPiece) {
        if (row >= size || col >= size || board[row][col] != null) {
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    /**
     * Get free cells
     *
     * @return
     */
    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    freeCells.add(new Pair<>(i, j));
                }
            }
        }

        return freeCells;
    }

    /**
     * Printing the board
     */
    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print("NULL");
                } else {
                    System.out.print(board[i][j].pieceType);
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
