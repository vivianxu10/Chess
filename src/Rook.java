    public class Rook extends Piece {

        public Rook(String id, Color color) {
            super(id, color);
        }

        @Override
        public boolean isValidMove(int currRow, int currCol, int newRow, int newCol, Board board) {
            if (currCol == newCol && currRow == newRow) {
                return false;
            }

            if (currCol == newCol) {
                int startRow = Math.min(currRow, newRow) + 1;
                int endRow = Math.max(currRow, newRow);
                for (int i = startRow; i < endRow; i++) {
                    if (!board.isEmptyPosition(i, currCol)) {
                        return false;
                    }
                }
                return true;
            }

            if (currRow == newRow) {
                int startCol = Math.min(currCol, newCol) + 1;
                int endCol = Math.max(currCol, newCol);
                for (int i = startCol; i < endCol; i++) {
                    if (!board.isEmptyPosition(currRow, i)) {
                        return false;
                    }
                }
                return true;
            }

            return false;
        }
}
