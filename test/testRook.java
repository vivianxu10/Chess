import org.junit.Test;

import static org.junit.Assert.*;

public class testRook {
    @Test
    public void testingThing(){
        Board board = new Board();
        board.displayBoard();
    }

    @Test
    public void testRookvalidMove(){
        Board board = new Board();
        Piece[][] chessBoard = new Piece[8][8]; // Correct initialization of 2D array

        Rook rook = new Rook("Rook A", Color.BLACK);
        chessBoard[2][3] = new Rook("Rook A", Color.BLACK);
        assertTrue(rook.isValidMove(4, 4, 4, 5, board));
    }
    @Test
    public void testRookInvalidMove() {
        Board board = new Board();
        Piece[][] chessBoard = new Piece[8][8]; // Correct initialization of 2D array

        Rook rook = new Rook("Rook A", Color.BLACK);
        chessBoard[2][3] = new Rook("Rook A", Color.BLACK);
        assertFalse(rook.isValidMove(1, 1, 1, 1, board));
    }
    @Test
    public void testMoveRook(){
        Board board = new Board();
        Piece[][] chessBoard = new Piece[8][8];
        Rook rook = new Rook("Rook A", Color.BLACK);
        board.chessBoard[3][3] = new Rook("Rook", Color.BLACK);
        board.move(1, 4, 4, 1);
        assertNotNull(board.chessBoard[4][1]);
        assertNull(board.chessBoard[1][4]);
    }

}
    

