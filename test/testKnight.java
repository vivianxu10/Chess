import org.junit.Test;
import static org.junit.Assert.*;

public class testKnight {

    @Test
    public void testKnightValidMove() {
        Board board = new Board();
        Piece[][] chessBoard = new Piece[8][8];

        Knight knight = new Knight("Knight A", Color.WHITE);
        chessBoard[4][4] = new Knight("Knight A", Color.WHITE);
        assertTrue(knight.isValidMove(4, 4, 6, 5, board));
    }

    @Test
    public void testKnightInvalidMove() {
        Board board = new Board();

        Knight knight = new Knight("Knight A", Color.WHITE);
        board.chessBoard[4][4] = new Knight("Knight A", Color.WHITE);
        assertFalse(knight.isValidMove(4, 4, 4, 4, board));
    }

    @Test
    public void testMoveKnight() {
        Board board = new Board();
        Piece[][] chessBoard = new Piece[8][8];
        Knight knight = new Knight("Knight A", Color.WHITE);
        board.chessBoard[3][3] = new Knight("Knight A", Color.WHITE);
        board.move(3, 3, 5, 4);
        assertNotNull(board.chessBoard[5][4]);
        assertNull(board.chessBoard[3][3]);
    }
}
