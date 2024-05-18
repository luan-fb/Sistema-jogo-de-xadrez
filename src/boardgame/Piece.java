package boardgame;

 
public abstract class Piece {
	
   protected boardgame.position position;
   private Board board;
   
   
public Piece(Board board) {
	this.board = board;
	position = null; // Padrao do Java o valor Nulo ja e aderido
}


protected Board getBoard() {
	return board;
}

 public abstract boolean[][] possibleMoves();
   
 public boolean possibleMove(position position) {
	return possibleMoves()[position.getRow()][position.getColumn()];  
 } 
 public boolean isThereAnyPossibleMove() {
	 boolean[][] mat = possibleMoves();
	 for (int i =0; i < mat.length; i++) {
		for (int j =0; j < mat.length; j++) {
			if (mat[i][j]) {
				return true;
			}
		}
	 }
return false;
 }
 
 
}
