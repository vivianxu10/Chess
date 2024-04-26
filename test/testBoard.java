import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testBoard {

    @Test
    public void testEmptyPosition() {
        Board board = new Board();
        assertTrue(board.isEmptyPosition(3, 3));
        assertFalse(board.isEmptyPosition(0, 0));
        assertFalse(board.isEmptyPosition(10, 10));
        assertFalse(board.isEmptyPosition(-1, -1));
    }

    @Test
    public void testValidMoves() {
        Board board = new Board();
        assertTrue(board.validMoves(1, 1));
        assertFalse(board.validMoves(0, 0));
        assertFalse(board.validMoves(-1, -1));
    }

    @Test
    public void testMove() {
        Board board = new Board();
        board.move(1, 1, 2, 1);
        assertNull(board.chessBoard[1][1]);
        assertNotNull(board.chessBoard[2][1]);
    }

    @Test
    public void testSelectPiece() {
        Board board = new Board();
        board.selectPiece(1, 1);
        assertEquals(1, board.x);
        assertEquals(1, board.y);
    }

    @Test
    public void testIsNonSkippingMove() {
        Board board = new Board();
        assertTrue(board.isNonSkippingMove(0, 1, 0, 2, board));
        assertFalse(board.isNonSkippingMove(0, 1, 0, 3, board));
    }

    @Test
    public void testMovePiece() {
        Board board = new Board();
        assertTrue(board.move(1, 0, 2, 0));
        assertFalse(board.move(1, 0, 2, 1));
        assertNotNull(board.chessBoard[2][0]);
        assertNull(board.chessBoard[1][0]);
    }

}
