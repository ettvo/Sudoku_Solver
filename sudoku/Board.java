package sudoku;
import java.util.Random;

/** The main testing file for Sudoku Solver
 *  @author Evelyn Vo
 *  @date_created 1/5/22
 *  @date_modified 1/5/22
 */
public class Board {
    public static void main(String args[]) {

    }

    /** Creates a randomly generated Sudoku board that
     * is, by default, 9x9 (made of smaller 3x3 segments). */
    public Board() {
        _board = new int[9][9];
        shuffleBoard();
    }

    /** Creates a randomly generated Sudoku board with
     * a specified dimension.
     * @param size A square integer representing the length
     *             of one side of the desired board */
    public Board(int size) {
        _board = new int[size][size];
        shuffleBoard();
    }

    /** Copies a given board into the current game. */
    public Board(int[][] board) {
        _board = new int[board.length][board.length];
        for (int row = 0; row < board.length; row += 1) {
            System.arraycopy(board[row], 0, _board[row], 0, board.length);
        }
    }

    /** Shuffles the board while maintaining the property
     * that every row and every column has only one of the
     * numbers in the range [0, _size].
     */
    private void shuffleBoard() {

    }

    private int[][] _board;
}
