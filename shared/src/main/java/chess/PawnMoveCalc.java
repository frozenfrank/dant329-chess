package chess;

import java.util.Collection;
import java.util.HashSet;

public class PawnMoveCalc {

    public static Collection<ChessMove> staticMove(ChessBoard board, ChessPosition myPosition, ChessGame.TeamColor pieceColor) {
        Collection<ChessMove> moves = new HashSet<>();

        int row = myPosition.getRow();
        int column = myPosition.getColumn();

        //WHITE PAWN
        if(pieceColor == ChessGame.TeamColor.WHITE){
            //first move two spaces
            ChessPosition currentCheck = new ChessPosition(row+2, column);
            ChessPosition currentCheckOne = new ChessPosition(row+1, column);
            if(row == 2 && board.getPiece(currentCheck) == null && board.getPiece(currentCheckOne) == null){
                moves.add(new ChessMove(myPosition,currentCheck,null));
            }

            //second move one space
            currentCheck = new ChessPosition(row+1, column);
            if(row < 8 && board.getPiece(currentCheck) == null){
                if(row+1 == 8){
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.QUEEN));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.BISHOP));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.ROOK));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.KNIGHT));
                }else{
                    moves.add(new ChessMove(myPosition,currentCheck,null));
                }
            }

            //enemy left
            currentCheck = new ChessPosition(row+1, column-1);
            if(row < 8 && column > 1 && board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
                if(row+1 == 8){
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.QUEEN));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.BISHOP));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.ROOK));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.KNIGHT));
                }else{
                    moves.add(new ChessMove(myPosition,currentCheck,null));
                }
            }

            //enemy right

            currentCheck = new ChessPosition(row+1, column+1);
            if(row < 8 && column < 8 && board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
                if(row+1 == 8){
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.QUEEN));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.BISHOP));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.ROOK));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.KNIGHT));
                }else{
                    moves.add(new ChessMove(myPosition,currentCheck,null));
                }
            }
        }else{
            //first move two spaces
            ChessPosition currentCheck = new ChessPosition(row-2, column);
            ChessPosition currentCheckOne = new ChessPosition(row-1, column);
            if(row == 7  && board.getPiece(currentCheck) == null && board.getPiece(currentCheckOne) == null){
                moves.add(new ChessMove(myPosition,currentCheck,null));
            }

            //second move one space
            currentCheck = new ChessPosition(row-1, column);
            if(row > 1 && board.getPiece(currentCheck) == null){
                if(row-1 == 1){
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.QUEEN));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.BISHOP));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.ROOK));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.KNIGHT));
                }else{
                    moves.add(new ChessMove(myPosition,currentCheck,null));
                }
            }

            //enemy left
            currentCheck = new ChessPosition(row-1, column-1);
            if(row > 1 && column > 1 && board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
                if(row-1 == 1){
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.QUEEN));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.BISHOP));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.ROOK));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.KNIGHT));
                }else{
                    moves.add(new ChessMove(myPosition,currentCheck,null));
                }
            }

            //enemy right

            currentCheck = new ChessPosition(row-1, column+1);
            if(row > 1 && column < 8 && board.getPiece(currentCheck) != null && board.getPiece(currentCheck).getTeamColor() != pieceColor){
                if(row-1 == 1){
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.QUEEN));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.BISHOP));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.ROOK));
                    moves.add(new ChessMove(myPosition,currentCheck,ChessPiece.PieceType.KNIGHT));
                }else{
                    moves.add(new ChessMove(myPosition,currentCheck,null));
                }
            }
        }

        //end of board move and promote, TODO: Maybe I have to add a method here? Not sure.

        return moves;
    }
}
