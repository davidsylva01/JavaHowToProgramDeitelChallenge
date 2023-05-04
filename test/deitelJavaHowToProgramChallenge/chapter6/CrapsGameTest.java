package deitelJavaHowToProgramChallenge.chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CrapsGameTest {
    CrapsGame craps;
    @Test
    @BeforeEach
    void setUp(){
        craps = new CrapsGame();
    }
    @Test
    void testDiceCanBeRolled(){
        craps.rollDice();
    }
    @Test
    void testPlayerCanPlayCrab(){
        craps.playCrabs();
    }
}
