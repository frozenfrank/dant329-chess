package chess;

import java.util.Collection;
import java.util.HashSet;

public class QueenMoveCalc {

        public static Collection<ChessMove> staticMove(ChessBoard board, ChessPosition myPosition, ChessGame.TeamColor pieceColor) {
            Collection<ChessMove> moves = new HashSet<>();

            //Reuse Bishop move set and Rook move set
            moves.addAll(BishopMoveCalc.staticMove(board, myPosition, pieceColor));
            moves.addAll(RookMoveCalc.staticMove(board, myPosition, pieceColor));

            return moves;
        }
}
