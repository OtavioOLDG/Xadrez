package chess;

import board_game.Position;

public class ChessPosition {
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) throws ChessException {
		if(column < 'a' || column > 'h' || row > 8 || row < 1) {
			throw new ChessException("Inexisting column");
		}
		this.column = column;
		this.row = row;
		
			
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	
	protected Position toPosition() {
		return new Position((8 - row), column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) throws ChessException {
		return new ChessPosition((char) (position.getColumn() + 'a'), (8 - position.getRow()));
	}

	@Override
	public String toString() {
		return "" + column + row;
	}
	
	
}
