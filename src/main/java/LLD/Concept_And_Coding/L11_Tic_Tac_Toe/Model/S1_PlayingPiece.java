package LLD.Concept_And_Coding.L11_Tic_Tac_Toe.Model;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L11_Tic_Tac_Toe.Model
 * <p>
 * User: piyushbajaj
 * Date: 06/04/23
 * Time: 12:16 pm
 */

@Data
public class S1_PlayingPiece {
    PieceType pieceType;

    S1_PlayingPiece() {
    }

    S1_PlayingPiece(PieceType pieceType) {
        this.pieceType = pieceType;
    }
}
