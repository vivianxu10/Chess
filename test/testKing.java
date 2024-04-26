import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testKing {

    @Test
    public void testValidMove() {
        King king = new King("K", Color.WHITE);
        assertTrue(king.isValidMove(3, 3, 4, 4, new Board()));
        assertTrue(king.isValidMove(3, 3, 3, 4, new Board()));
        assertTrue(king.isValidMove(3, 3, 2, 4, new Board()));
    }

    @Test
    public void testInvalidMove() {
        King king = new King("K", Color.WHITE);
        assertFalse(king.isValidMove(3, 3, 5, 5, new Board()));
        assertFalse(king.isValidMove(3, 3, 3, 5, new Board()));
        assertFalse(king.isValidMove(3, 3, 1, 5, new Board()));
    }

    @Test
    public void testIllegalMove() {
        King king = new King("K", Color.WHITE);
        assertFalse(king.isValidMove(3, 3, 3, 4, new Board()));
        assertFalse(king.isValidMove(3, 3, 3, 2, new Board()));
    }

    @Test
    public void testCapture() {
        King king = new King("K", Color.WHITE);
        Board board = new Board();
        board.chessBoard[4][4] = new Pawn("P", Color.BLACK);
        assertTrue(king.isValidMove(3, 3, 4, 4, board));
    }
}
