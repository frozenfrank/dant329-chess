package chess;

import java.util.Collection;
import java.util.HashSet;


public class BishopMoveCalc {
    public static Collection<ChessMove> staticMove(ChessBoard board, ChessPosition myPosition, ChessGame.TeamColor pieceColor){
        Collection<ChessMove> moves = new HashSet<>();

        int row = myPosition.getRow();
        int column = myPosition.getColumn();

        //check up-right diagonal:
        while(row < 8 && column < 8) {
            //IsEmpty? move:check conditions
            ChessPosition currentCheck = new ChessPosition(row+1, column+1);
            if(board.getPiece(currentCheck) == null){
                //add to collection
                moves.add(new ChessMove(myPosition,currentCheck,null));
                row++;
                column++;
            }else{
                //friendly?
                if (board.getPiece(currentCheck).getTeamColor() != pieceColor) {
                    //add board position to collection and then break;
                    moves.add(new ChessMove(myPosition, currentCheck, null));
                }
                break;
            }
        }

        //check down-right diagonal:
        row = myPosition.getRow();
        column = myPosition.getColumn();

        while(row > 1 && column < 8) {
            //IsEmpty? move:check conditions
            ChessPosition currentCheck = new ChessPosition(row-1, column+1);
            if(board.getPiece(currentCheck) == null){
                //add to collection
                moves.add(new ChessMove(myPosition,currentCheck,null));
                row--;
                column++;
            }else{
                //friendly?
                if (board.getPiece(currentCheck).getTeamColor() != pieceColor) {
                    //add board position to collection and then break;
                    moves.add(new ChessMove(myPosition, currentCheck, null));
                }
                break;
            }
        }
        //check down-left diagonal:
        row = myPosition.getRow();
        column = myPosition.getColumn();

        while(row > 1 && column > 1) {
            //IsEmpty? move:check conditions
            ChessPosition currentCheck = new ChessPosition(row-1, column-1);
            if(board.getPiece(currentCheck) == null){
                //add to collection
                moves.add(new ChessMove(myPosition,currentCheck,null));
                row--;
                column--;
            }else{
                //friendly?
                if (board.getPiece(currentCheck).getTeamColor() != pieceColor) {
                    //add board position to collection and then break;
                    moves.add(new ChessMove(myPosition, currentCheck, null));
                }
                break;
            }
        }
        //check up-left diagonal:
        row = myPosition.getRow();
        column = myPosition.getColumn();

        while(row < 8 && column > 1) {
            //IsEmpty? move:check conditions
            ChessPosition currentCheck = new ChessPosition(row+1, column-1);
            if(board.getPiece(currentCheck) == null){
                //add to collection
                moves.add(new ChessMove(myPosition,currentCheck,null));
                row++;
                column--;
            }else{
                //friendly?
                if (board.getPiece(currentCheck).getTeamColor() != pieceColor) {
                    //add board position to collection and then break;
                    moves.add(new ChessMove(myPosition, currentCheck, null));
                }
                break;
            }
        }
        return moves;
    }
}

