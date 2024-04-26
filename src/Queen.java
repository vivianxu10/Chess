public class Queen extends Piece {

    public Queen(String id, Color color) {
        super(id, color);
    }

    @Override
    public boolean isValidMove(int currRow, int currCol, int newRow, int newCol, Board board) {
        if (currCol == newCol && currRow == newRow) {
            return false;
        }
        if (currCol == newCol && currRow != newRow) {
            int rowDir;
            if (newRow - currRow > 0) {
                rowDir = 1;
            } else {
                rowDir = -1;
            }

            int checkRow = currRow + rowDir;
            while (checkRow != newRow) {
                if (!board.isEmptyPosition(checkRow, newCol)) {
                    return false;
                }
                checkRow += rowDir;
            }
            return true;
        } else if (currCol != newCol && currRow == newRow) {
            int colDir;
            if (newCol - currCol > 0) {
                colDir = 1;
            } else {
                colDir = -1;
            }

            int checkCol = currCol + colDir;
            while (checkCol != newCol) {
                if (!board.isEmptyPosition(newRow, checkCol)) {
                    return false;
                }
                checkCol += colDir;
            }
            return true;
        } else if (Math.abs(newRow - currRow) == Math.abs(newCol - currCol)) {
            int rowDir;
            if (newRow - currRow > 0) {
                rowDir = 1;
            } else {
                rowDir = -1;
            }

            int colDir;
            if (newCol - currCol > 0) {
                colDir = 1;
            } else {
                colDir = -1;
            }

            int checkRow = currRow + rowDir;
            int checkCol = currCol + colDir;
            while (checkRow != newRow && checkCol != newCol) {
                if (!board.isEmptyPosition(checkRow, checkCol)) {
                    return false;
                }
                checkRow += rowDir;
                checkCol += colDir;
            }
            return true;
        }

        return false;
    }
}
