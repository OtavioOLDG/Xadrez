package board_game;

import chess.BoardException;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	public Position getPosition() {
		return position;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves() throws BoardException;
	
	public boolean possibleMove(Position position) throws BoardException {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() throws BoardException {
		boolean[][] mat = possibleMoves();
		for(int i = 0; i < mat.length; i ++) {
			for(int j = 0; j < mat.length; j ++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}