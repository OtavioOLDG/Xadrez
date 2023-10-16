package application;

import chess.BoardException;
import chess.ChessException;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) throws BoardException, ChessException {

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}

}
