package chess;

import java.util.Collection;
import java.util.HashSet;

public class KnightMoveCalc {

    public static Collection<ChessMove> staticMove(ChessBoard board, ChessPosition myPosition, ChessGame.TeamColor pieceColor) {
        Collection<ChessMove> moves = new HashSet<>();

        int row = myPosition.getRow();
        int column = myPosition.getColumn();


        //up right
        ChessPosition currentCheck = new ChessPosition(row+2, column+1);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && row < 7 && column <8 ) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }

        //up left
        currentCheck = new ChessPosition(row+2, column-1);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && row < 7 && column > 1) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }

        //left up
        currentCheck = new ChessPosition(row+1, column-2);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && row < 8 && column > 2) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }

        //left down
        currentCheck = new ChessPosition(row-1, column-2);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && row > 1 && column > 2) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }

        //right up
        currentCheck = new ChessPosition(row+1, column+2);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && row < 8 && column < 7) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }

        //right down
        currentCheck = new ChessPosition(row-1, column+2);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && row > 1 && column < 7) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }
        //down right
        currentCheck = new ChessPosition(row-2, column+1);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && row > 2 && column < 8) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }

        //down left
        currentCheck = new ChessPosition(row-2, column-1);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && row > 2 && column > 1) {
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }

        return moves;
    }
}
