package sudoku;
import java.io.File;
import java.io.IOException;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/** The utilities file for Sudoku Solver
 *  @author Evelyn Vo
 *  @date_created 1/5/22
 *  @date_modified 1/5/22
 */
public class Utils {
    public static void main(String args[]) {

    }

    /** Checks that the given int[] does not have
     * any duplicate numbers AND has every number
     * @return True if every number in [0, arr.length]
     *         appears
     */
    public static boolean hasSudokuCondition(int[] arr) {
        int[] copy = new int[arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);
        Arrays.sort(copy);
        if (copy[0] != 0 || copy[arr.length - 1] != copy.length) {
            return false;
        } else {
            for (int pos = 1; pos < arr.length; pos += 1) {
                if (arr[pos] == arr[pos - 1]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean checkValidBoard(Board board) {
        return true;
    }

}