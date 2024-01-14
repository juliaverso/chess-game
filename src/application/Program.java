package application;

import ches.ChesMatch;

public class Program {
	public static void main (String[] args) {
		ChesMatch chesMatch = new ChesMatch();
		UI.printBoard(chesMatch.getPieces());
	}

}
