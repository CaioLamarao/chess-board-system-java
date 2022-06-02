package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; //A peça inicia sem posição
	}


	protected Board getBoard() {
		return board;
	}

	
	
}
