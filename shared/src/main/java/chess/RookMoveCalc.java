package chess;

import java.util.Collection;
import java.util.HashSet;


public class RookMoveCalc {

    public static Collection<ChessMove> staticMove(ChessBoard board, ChessPosition myPosition, ChessGame.TeamColor pieceColor) {
        Collection<ChessMove> moves = new HashSet<>();

        //check up

        int row = myPosition.getRow();
        int column = myPosition.getColumn();
        while(row < 8){
            ChessPosition currentCheck = new ChessPosition(row+1, column);
            if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
                moves.add(new ChessMove(myPosition,currentCheck,null));
                break;
            }else if(board.getPiece(currentCheck) == null){
                moves.add(new ChessMove(myPosition,currentCheck,null));
            }else{
                break;
            }
            row++;
        }

        // check down

        row = myPosition.getRow();
        while(row > 1){
            ChessPosition currentCheck = new ChessPosition(row-1, column);
            if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
                moves.add(new ChessMove(myPosition,currentCheck,null));
                break;
            }else if(board.getPiece(currentCheck) == null){
                moves.add(new ChessMove(myPosition,currentCheck,null));
            }else{
                break;
            }
            row--;
        }

        //check left

        column = myPosition.getColumn();
        row = myPosition.getRow();
        while(column < 8){
            ChessPosition currentCheck = new ChessPosition(row, column+1);
            if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
                moves.add(new ChessMove(myPosition,currentCheck,null));
                break;
            }else if(board.getPiece(currentCheck) == null){
                moves.add(new ChessMove(myPosition,currentCheck,null));
            }else{
                break;
            }
            column++;
        }

        //check right

        column = myPosition.getColumn();
        while(column > 1){
            ChessPosition currentCheck = new ChessPosition(row, column-1);
            if(board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
                moves.add(new ChessMove(myPosition,currentCheck,null));
                break;
            }else if(board.getPiece(currentCheck) == null){
                moves.add(new ChessMove(myPosition,currentCheck,null));
            }else{
                break;
            }
            column--;
        }

        return moves;
    }
}
