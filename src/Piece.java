

public abstract class Piece {

    private String id;

    private Color color;

    public Piece(String id, Color color) {
        this.id = id;
        this.color = color;
    }
    public String getId() {
        return id;
    }

    public Color getColor() {
        return color;
    }

    public abstract boolean isValidMove(int currRow, int currCol, int newRow, int newCol, Board board);



}
