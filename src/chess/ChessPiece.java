package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.position;

public abstract class ChessPiece extends Piece {
	private Color color;
 
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
    protected boolean isThereOpponentPiece (position position) {
    	ChessPiece p = (ChessPiece)getBoard().piece(position);
    	return p != null && p.getColor() != color;
    }
}
