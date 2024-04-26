public class Pawn extends Piece {

    private boolean isFirstMove;

    public Pawn(String id, Color color) {
        super(id, color);
        isFirstMove = true;
    }

    @Override
    public boolean isValidMove(int currRow, int currCol, int newRow, int newCol, Board board) {
        int direction = getColor() == Color.WHITE ? -1 : 1;

        if (newRow < 0 || newRow >= board.chessBoard.length || newCol < 0 || newCol >= board.chessBoard[0].length) {
            return false;
        }

        if (currCol == newCol && currRow + direction == newRow && board.isEmptyPosition(newRow, newCol)) {
            isFirstMove = false;
            return true;
        }

        if (isFirstMove && currCol == newCol && currRow + 2 * direction == newRow && board.isEmptyPosition(newRow, newCol) && board.isEmptyPosition(currRow + direction, newCol)) {
            isFirstMove = false;
            return true;
        }

        if (Math.abs(newCol - currCol) == 1 && currRow + direction == newRow && !board.isEmptyPosition(newRow, newCol) && board.chessBoard[newRow][newCol].getColor() != getColor()) {
            isFirstMove = false;
            return true;
        }

        return false;
    }
}