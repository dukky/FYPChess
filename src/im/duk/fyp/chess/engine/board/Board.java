package im.duk.fyp.chess.engine.board;

/**
 * Interface for accessing a chess board object, to allow for
 * differing implementations (Bitboard, array etc).
 * @author Andreas Holley
 *
 */
public interface Board {
	
	public static class FILE {
		public static final int A = 0;
		public static final int B = 1;
		public static final int C = 2;
		public static final int D = 3;
		public static final int E = 4;
		public static final int F = 5; 
		public static final int G = 6;
		public static final int H = 7;
	}
	
	/**
	 * Get the piece on the board at the specified position.
	 * @param rank 0-7
	 * @param file A-H
	 * @return
	 */
	public Piece at(int rank, int file);
	
	/**
	 * Get all the pieces on a given file.
	 * @param file A-H
	 * @return
	 */
	public Piece[] file(int file);
	
	/**
	 * Get all the pieces on a given rank.
	 * @param rank 0-7
	 * @return
	 */
	public Piece[] rank(int rank);

}
