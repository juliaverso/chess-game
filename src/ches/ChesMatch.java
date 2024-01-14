package ches;

import boardgame.Board;

public class ChesMatch {
	private Board board; 
	
	public ChesMatch() {
		board = new Board(8, 8);
	}
	
	public ChesPiece[][] getPieces(){
		ChesPiece[][] mat = new ChesPiece [board.getRows()][board.getColumns()];
	 for(int i=0; i<board.getRows(); i++) {
		 for(int j=0; j<board.getColumns(); j++) {
			 mat[i][j]=(ChesPiece) board.piece(i, j);
		 }
	 } return mat; 
	}

}
