package LLD.Concept_And_Coding.L11_Tic_Tac_Toe.Model;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L11_Tic_Tac_Toe.Model
 * <p>
 * User: piyushbajaj
 * Date: 06/04/23
 * Time: 12:18 pm
 */

@Data
public class S2_PlayingPieceO extends S1_PlayingPiece {
    S2_PlayingPieceO() {
        super(PieceType.O);
    }
}
