package chess;

import board_game.Board;
import board_game.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() throws BoardException {
		this.board = new Board(8, 8);
		initialSetUp();
	}
	
	public ChessPiece[][] getPieces() throws BoardException{
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void initialSetUp() throws BoardException {
		board.placePiece(new Rook(board, Color.BLACK), new Position(0,0));
		board.placePiece(new King(board, Color.WHITE), new Position(7,4));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
	}
	
}
