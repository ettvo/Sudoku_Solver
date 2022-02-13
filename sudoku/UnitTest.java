package sudoku;
import org.junit.Test;
import java.io.File;
import java.io.IOException;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/** The unit test file for Sudoku
 *  @author Evelyn Vo
 *  @date_created 1/5/22
 *  @date_modified 1/5/22
 */
public class UnitTest {
    public static void main(String args[]) {

    }

    /** Checks that every row and every column has exactly
     * 1 of each number in [0, board.length].
     * @param board The board to be checked
     * @return True if no row or column has a duplicate of any
     *         number, no entry is empty, and every number in
     *         [0, board.length] is present.
     */
    private boolean hasSudokuCondition(int[][] board) {
        for (int pos = 0; pos < board.length; pos += 1) {
            int[] row = board[pos];
            int[] col = new int[board.length];
            for (int x = 0; x < board.length; x += 1) {
                col[x] = board[x][pos];
            }

        }
        return false;
    }

}