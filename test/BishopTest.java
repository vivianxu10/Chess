import org.junit.Test;

import static org.junit.Assert.*;

public class BishopTest {

    @Test
    public void testValidMove() {
        Board board = new Board();
        Bishop bishop = new Bishop("Bishop", Color.WHITE);

        // Place the bishop at position (3, 3) on the board
        int currRow = 3;
        int currCol = 3;

        // Test diagonal moves
        assertTrue(bishop.isValidMove(currRow, currCol, 0, 0, board)); // Up-left diagonal
        assertTrue(bishop.isValidMove(currRow, currCol, 0, 6, board)); // Up-right diagonal
        assertTrue(bishop.isValidMove(currRow, currCol, 6, 0, board)); // Down-left diagonal
        assertTrue(bishop.isValidMove(currRow, currCol, 6, 6, board)); // Down-right diagonal

        // Test non-diagonal moves
        assertFalse(bishop.isValidMove(currRow, currCol, 0, 3, board)); // Up
        assertFalse(bishop.isValidMove(currRow, currCol, 6, 3, board)); // Down
        assertFalse(bishop.isValidMove(currRow, currCol, 3, 0, board)); // Left
        assertFalse(bishop.isValidMove(currRow, currCol, 3, 6, board)); // Right
    }

    @Test
    public void testInvalidMove() {
        Board board = new Board();
        Bishop bishop = new Bishop("Bishop", Color.WHITE);

        int currRow = 3;
        int currCol = 3;

        assertFalse(bishop.isValidMove(currRow, currCol, 5, 2, board));
        assertTrue(bishop.isValidMove(currRow, currCol, 5, 5, board));
    }
}
