

public class Board {
    public Piece[][] chessBoard = new Piece[8][8]; // Correct initialization of 2D array
    public int x;
    public int y;

    public Board() {
        initializeBoard();
    }

    private void initializeBoard() {
        chessBoard[0][0] = new Rook("♜", Color.BLACK);    // Black Rook
        chessBoard[0][1] = new Knight("♞", Color.BLACK);  // Black Knight
        chessBoard[0][2] = new Bishop("♝", Color.BLACK);  // Black Bishop
        chessBoard[0][3] = new Queen("♛", Color.BLACK);   // Black Queen
        chessBoard[0][4] = new King("♚", Color.BLACK);    // Black King
        chessBoard[0][5] = new Bishop("♝", Color.BLACK);  // Black Bishop
        chessBoard[0][6] = new Knight("♞", Color.BLACK);  // Black Knight
        chessBoard[0][7] = new Rook("♜", Color.BLACK);    // Black Rook

        chessBoard[7][0] = new Rook("♖", Color.WHITE);    // White Rook
        chessBoard[7][1] = new Knight("♘", Color.WHITE);  // White Knight
        chessBoard[7][2] = new Bishop("♗", Color.WHITE);  // White Bishop
        chessBoard[7][3] = new Queen("♕", Color.WHITE);   // White Queen
        chessBoard[7][4] = new King("♔", Color.WHITE);    // White King
        chessBoard[7][5] = new Bishop("♗", Color.WHITE);  // White Bishop
        chessBoard[7][6] = new Knight("♘", Color.WHITE);  // White Knight
        chessBoard[7][7] = new Rook("♖", Color.WHITE);    // White Rook

        for (int i = 0; i < 8; i++) {
            chessBoard[1][i] = new Pawn("♟", Color.BLACK); // Black Pawn
            chessBoard[6][i] = new Pawn("♙", Color.WHITE); // White Pawn
        }
    }


    /*public void displayBoard() {
        System.out.println("+---+---+---+---+---+---+---+---+");
        for (int i = 0; i < 8; i++) {
            System.out.print("|");
            for (int j = 0; j < 8; j++) {
                Piece piece = chessBoard[i][j];
                String symbol = (piece != null) ? piece.getId() : " ";
                System.out.print(" " + symbol + " |");
            }
            System.out.println(" " + (8 - i));
            System.out.println("+---+---+---+---+---+---+---+---+");
        }
        System.out.println("   a  b  c  d  e  f  g  h");*/

    public void displayBoard() {
        System.out.println("   a    b    c   d    e    f   g    h");
        System.out.println(" +--------------------------------------+");
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + "|");
            for (int j = 0; j < 8; j++) {
                Piece piece = chessBoard[i][j];
                String symbol = (piece != null) ? piece.getId() : "  ";
                System.out.print(" " + symbol + " |");
            }
            System.out.println("\n +--------------------------------------+");
        }
    }





    public boolean validMoves(int row, int col) {
        return false;
    }

    public void move(int newX, int newY) {
        if (validMoves(newX, newY)) {
            chessBoard[newX][newY] = chessBoard[x][y];
            chessBoard[x][y] = null;
            System.out.println("Piece moved to: " + (char) ('A' + newY) + (newX + 1));
        } else {
            System.out.println("Invalid move");
        }
    }

    public void selectPiece(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean isEmptyPosition(int currRow, int currCol) {
        if (currRow < 0 || currRow >= chessBoard.length || currCol < 0 || currCol >= chessBoard[currRow].length) {
            return false;
        }

        return chessBoard[currRow][currCol] == null;
    }


    public boolean nonSkip(int currRow, int currCol, int newRow, int newCol) {
        {

        }
        return false;
    }


    public boolean move(int currRow, int currCol, int newRow, int newCol) {
        Piece tempPiece = this.chessBoard[currRow][currCol];
        if(!tempPiece.isValidMove(currRow,currCol,newRow, newCol, this)){
            return false;
        }
        this.chessBoard[newRow][newCol] = tempPiece;
        this.chessBoard[currRow][currCol] = null;
        return true;
    }
    public boolean isNonSkippingMove(int currRow, int currCol, int newRow, int newCol, Board board) {
        if (currRow == newRow) {
            int startCol = Math.min(currCol, newCol) + 1;
            int endCol = Math.max(currCol, newCol);
            for (int col = startCol; col < endCol; col++) {
                if (!board.isEmptyPosition(col, currRow)) {
                    return false;
                }
            }
            return true;
        } else if (currCol == newCol) {
            int startRow = Math.min(currRow, newRow) + 1;
            int endRow = Math.max(currRow, newRow);
            for (int row = startRow; row < endRow; row++) {
                if (!board.isEmptyPosition(currCol, row)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }



}


