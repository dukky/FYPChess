package im.duk.fyp.chess.engine.board;

import java.util.Arrays;

/**
 * Bitboard representation of a chess board.
 * @author Andreas Holley
 *
 */
public class BitBoard implements Board {
	
	// Array indices for colours and pieces.
	// Only for use internally in bitboard.
	private static final int WHITE = 0;
	private static final int BLACK = 1;
	
	private static final int KING = 0;
	private static final int QUEEN = 1;
	private static final int ROOK = 2;
	private static final int KNIGHT = 3;
	private static final int BISHOP = 4;
	private static final int PAWN = 5;
	
	private static final long[][] DEFAULT_POSITION = new long[][] {
		// WHITE
		{
			0x1000000000000000L, // KING
			0x0800000000000000L, // QUEEN
			0x8100000000000000L, // ROOKS
			0x4200000000000000L, // KNIGHTS
			0x2400000000000000L, // BISHOPS
			0x00FF000000000000L  // PAWNS
		},
		// BLACK
		{
			0x0000000000000010L, // KING
			0x0000000000000008L, // QUEEN
			0x0000000000000081L, // ROOKS
			0x0000000000000042L, // KNIGHTS
			0x0000000000000024L, // BISHOPS
			0x000000000000FF00L  // PAWNS
		}
	};
	
	private long[][] board; 
	
	/**
	 * Constructor for default position
	 */
	public BitBoard() {
		board = new long[2][6];
		for(int i = 0; i < board.length; ++i) {
			board[i] = Arrays.copyOf(DEFAULT_POSITION[i], DEFAULT_POSITION[i].length);
		}
	}
	
	/**
	 * Copy constructor
	 * @param position
	 */
	public BitBoard(BitBoard position) {
		board = new long[2][6];
		for(int i = 0; i < board.length; ++i) {
			board[i] = Arrays.copyOf(position.board[i], position.board[i].length);
		}
	}
	
	@Override
	public Piece at(int rank, int file) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public @Override String toString() {
		// TODO
		return null;
	}
	

	@Override
	public Piece[] file(int file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Piece[] rank(int rank) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		System.out.println(Long.toHexString(new BitBoard().board[WHITE][QUEEN]));
		
		
		// Test equality of copy
		
		long[][] first = DEFAULT_POSITION;
		long[][] second = new BitBoard().board;
		System.out.println(Arrays.deepEquals(first, second));
		
	}

}
