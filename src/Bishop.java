public class Bishop extends Piece {

    public Bishop(String id, Color color) {
        super(id, color);
    }

//    @Override
//    public boolean isValidMove(int currUp, int currDown, int newUp, int newDown, Board board) {
//        if (currDown == newDown && currUp == newUp) {
//            return false;
//        }
//        if (newDown != currDown && newUp != currUp) {
//            return false;
//        }
//
//        if (board.isEmptyPosition(newDown, newUp)){
//            return true;
//        }
//        Color currColor = board.chessBoard[currUp][currDown].getColor();
//        Color tarColor = board.chessBoard[newUp][newDown].getColor();
//        if (currColor.equals(tarColor)) {
//            return false;
//        }else{
//            return board.nonSkip(currUp, currDown, newUp, newDown);

    @Override
    public boolean isValidMove(int currRow, int currCol, int newRow, int newCol, Board board) {
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

        if (Math.abs(newRow - currRow) == Math.abs(newCol - currCol)) {
            int checkRow = currRow + rowDir;
            int checkCol = currCol + colDir;

            while (checkRow != newRow || checkCol != newCol) {
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




