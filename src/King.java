public class King extends Piece {

    public King(String id, Color color) {
        super(id, color);
    }

    @Override
    public boolean isValidMove(int currRow, int currCol, int newRow, int newCol, Board board) {
        int rowDiff = Math.abs(newRow - currRow);
        int colDiff = Math.abs(newCol - currCol);

        return (rowDiff <= 1 && colDiff <= 1);
    }
}
