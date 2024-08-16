package LLD.Concept_And_Coding.L11_Tic_Tac_Toe.Model;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L11_Tic_Tac_Toe.Model
 * <p>
 * User: piyushbajaj
 * Date: 06/04/23
 * Time: 12:32 pm
 */

@Data
public class S4_Player {
    String name;
    S1_PlayingPiece playingPiece;

    public S4_Player(String name, S1_PlayingPiece playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
    }
}
