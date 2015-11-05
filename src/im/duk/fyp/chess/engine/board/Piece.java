package im.duk.fyp.chess.engine.board;

/**
 * Enum to represent a piece
 * @author andreas
 *
 */
public enum Piece {
	
	WHITE_PAWN(0),
	WHITE_BISHOP(1),
	WHITE_KNIGHT(2),
	WHITE_ROOK(3),
	WHITE_QUEEN(4),
	WHITE_KING(5),
	
	BLACK_PAWN(6),
	BLACK_BISHOP(7),
	BLACK_KNIGHT(8),
	BLACK_ROOK(9),
	BLACK_QUEEN(10),
	BLACK_KING(11),
	
	EMPTY(12);
	
	private int val;
	
	private Piece(int val) {
		this.val = val;
	}
	
	public int value() {
		return val;
	}
	
}
