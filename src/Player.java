import java.util.Scanner;

public class Player {
    private Scanner scanner;

    public Player() {
        this.scanner = new Scanner(System.in);
    }

    public int[] selectPosition() {
        System.out.println("Enter the row and column (for ex. 0 0 for A1):");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[] { row, col };
    }
}
