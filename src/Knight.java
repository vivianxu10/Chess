public class Knight extends Piece {

    public Knight(String id, Color color) {
        super(id, color);
    }

    @Override
    public boolean isValidMove(int currRow, int currCol, int newRow, int newCol, Board board) {
        int rowDiff = Math.abs(newRow - currRow);
        int colDiff = Math.abs(newCol - currCol);

        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
}
