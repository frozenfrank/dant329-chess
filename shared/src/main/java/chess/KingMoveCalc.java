package chess;

import java.util.Collection;
import java.util.HashSet;

public class KingMoveCalc {
    public static Collection<ChessMove> staticMove(ChessBoard board, ChessPosition myPosition, ChessGame.TeamColor pieceColor) {
        Collection<ChessMove> moves = new HashSet<>();
        int row = myPosition.getRow();
        int column = myPosition.getColumn();

        //check up straight
        ChessPosition currentCheck = new ChessPosition(row+1, column);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && row !=8){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }

        //check up right diagonal
        currentCheck = new ChessPosition(row+1, column+1);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && row !=8 && column !=8){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }

        //check up left diagonal
        currentCheck = new ChessPosition(row+1, column-1);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && row !=8 && column !=1){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }

        //check down straight
        currentCheck = new ChessPosition(row-1, column);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && row !=1){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }

        //check down right diagonal
        currentCheck = new ChessPosition(row-1, column+1);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && row !=1 && column !=8){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }

        //check down left diagonal
        currentCheck = new ChessPosition(row-1, column-1);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && row !=1 && column !=1){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }

        //check left
        currentCheck = new ChessPosition(row, column-1);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && column !=1){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }
        //check right
        currentCheck = new ChessPosition(row, column+1);
        if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }else if(board.getPiece(currentCheck) == null && column !=8){
            moves.add(new ChessMove(myPosition,currentCheck,null));
        }
        return moves;
    }
}
