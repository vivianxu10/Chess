import org.junit.Test;
import static org.junit.Assert.*;

public class testPawn {

    @Test
    public void testPawnValidMove() {
        Board board = new Board();
        Piece[][] chessBoard = new Piece[8][8]; // Correct initialization of 2D array

        Pawn pawn = new Pawn("Pawn A", Color.WHITE);
        chessBoard[6][3] = new Pawn("Pawn A", Color.WHITE);
        assertTrue(pawn.isValidMove(6, 3, 4, 3, board)); // Testing valid move
    }

    @Test
    public void testPawnInvalidMove() {
        Board board = new Board();
        //Piece[][] chessBoard = new Piece[8][8]; // Correct initialization of 2D array

        Pawn pawn = new Pawn("Pawn A", Color.WHITE);
        board.chessBoard[4][3] = new Pawn("Pawn A", Color.WHITE);
        assertFalse(pawn.isValidMove(4, 3, 4, 3, board)); // Testing invalid move
    }

    @Test
    public void testMovePawn() {
        Board board = new Board();
        Piece[][] chessBoard = new Piece[8][8];
        Pawn pawn = new Pawn("Pawn A", Color.WHITE);
        board.chessBoard[6][3] = new Pawn("Pawn A", Color.WHITE);
        board.move(6, 3, 4, 3); // Move from (6, 3) to (4, 3)
        assertNotNull(board.chessBoard[4][3]); // Assert that there is a piece at (4, 3)
        assertNull(board.chessBoard[6][3]); // Assert that there is no piece at (6, 3)
    }
}
