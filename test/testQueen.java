import org.junit.Test;
import static org.junit.Assert.*;

public class testQueen {

    @Test
    public void testQueenValidMove() {
        Board board = new Board();
        Piece[][] chessBoard = new Piece[8][8]; // Correct initialization of 2D array

        Queen queen = new Queen("Queen A", Color.BLACK);
        chessBoard[2][3] = new Queen("Queen A", Color.BLACK);
        assertTrue(queen.isValidMove(2, 3, 4, 5, board)); // Testing valid move
    }

    @Test
    public void testQueenInvalidMove() {
        Board board = new Board();
        //Piece[][] chessBoard = new Piece[8][8]; // Correct initialization of 2D array

        Queen queen = new Queen("Queen A", Color.BLACK);
        board.chessBoard[1][1] = new Queen("Queen A", Color.BLACK);
        assertFalse(queen.isValidMove(1, 1, 1, 1, board)); // Testing invalid move
    }

    @Test
    public void testMoveQueen() {
        Board board = new Board();
        Piece[][] chessBoard = new Piece[8][8];
        Queen queen = new Queen("Queen A", Color.BLACK);
        board.chessBoard[3][3] = new Queen("Queen A", Color.BLACK);
        board.move(1, 4, 4, 1); // Move from (1, 4) to (4, 1)
        assertNotNull(board.chessBoard[4][1]); // Assert that there is a piece at (4, 1)
        assertNull(board.chessBoard[1][4]); // Assert that there is no piece at (1, 4)
    }
}
