package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; //A pe�a inicia sem posi��o
	}


	protected Board getBoard() {
		return board;
	}

	
	
}
