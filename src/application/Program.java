package application;

import chess.BoardException;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) throws BoardException {

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}

}
