package chess;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece {
    private PieceType type;
    private ChessGame.TeamColor pieceColor;

    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        this.type = type;
        this.pieceColor = pieceColor;
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {
        return pieceColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {
        return type;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {

        Collection<ChessMove> moves = new HashSet<>();

        //BISHOP MOVE SET
        if(this.getPieceType() == PieceType.BISHOP) {
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
                    if (board.getPiece(currentCheck).pieceColor != this.pieceColor) {
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
                    if (board.getPiece(currentCheck).pieceColor != this.pieceColor) {
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
                    if (board.getPiece(currentCheck).pieceColor != this.pieceColor) {
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
                    if (board.getPiece(currentCheck).pieceColor != this.pieceColor) {
                        //add board position to collection and then break;
                        moves.add(new ChessMove(myPosition, currentCheck, null));
                    }
                    break;
                }
            }
        }
    return moves;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChessPiece that = (ChessPiece) o;
        return type == that.type && pieceColor == that.pieceColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, pieceColor);
    }
}
