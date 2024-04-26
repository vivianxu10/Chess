import org.junit.Test;
import static org.junit.Assert.*;

public class testGameState {

    @Test
    public void testGetBoard() {
        GameState gameState = new GameState();
        assertNotNull(gameState.getBoard());
    }

    @Test
    public void testGetCurrentPlayer() {
        GameState gameState = new GameState();
        assertEquals(Color.WHITE, gameState.getCurrentPlayer());
    }

    @Test
    public void testIsGameOver() {
        GameState gameState = new GameState();
        assertFalse(gameState.isGameOver());
    }

    @Test
    public void testSwitchPlayer() {
        GameState gameState = new GameState();
        assertEquals(Color.WHITE, gameState.getCurrentPlayer());
        gameState.switchPlayer();
        assertEquals(Color.BLACK, gameState.getCurrentPlayer());
    }

    @Test
    public void testSetGameOver() {
        GameState gameState = new GameState();
        assertFalse(gameState.isGameOver());
        gameState.setGameOver(true);
        assertTrue(gameState.isGameOver());
    }

    @Test
    public void testGetCurrentPlayerObject() {
        GameState gameState = new GameState();
        assertNotNull(gameState.getCurrentPlayerObject());
    }


}
