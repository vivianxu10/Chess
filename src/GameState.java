public class GameState {
    private Board board;
    private Color currentPlayer;
    private boolean isGameOver;
    private Player player1;
    private Player player2;

    public GameState() {
        this.board = new Board();
        this.currentPlayer = Color.WHITE;
        this.isGameOver = false;
        this.player1 = new Player();
        this.player2 = new Player();
    }

    public Board getBoard() {
        return board;
    }

    public Color getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    public Player getCurrentPlayerObject() {
        return currentPlayer == Color.WHITE ? player1 : player2;
    }

    public void playGame() {
        while (!isGameOver()) {
            getBoard().displayBoard();
            System.out.println("Current turn: " + getCurrentPlayer());
            int[] selectedPosition = getCurrentPlayerObject().selectPosition();
            int fromRow = selectedPosition[0];
            int fromCol = selectedPosition[1];
            getBoard().selectPiece(fromRow, fromCol);

            int[] newPosition = getCurrentPlayerObject().selectPosition();
            int toRow = newPosition[0];
            int toCol = newPosition[1];

            if (getBoard().move(fromRow, fromCol, toRow, toCol)) {
                switchPlayer();
            } else {
                System.out.println("Invalid move, please try again.");
            }
        }
    }

    public static void main(String[] args) {
        GameState gameState = new GameState();
        gameState.playGame();
    }
}
