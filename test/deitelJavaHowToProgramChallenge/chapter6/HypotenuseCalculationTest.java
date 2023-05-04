package deitelJavaHowToProgramChallenge.chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HypotenuseCalculationTest {
    HypotenuseCalculation hypotenuseCalculation;
    @Test
    @BeforeEach
    void setUp(){
        hypotenuseCalculation = new HypotenuseCalculation();
        }
        @Test
        void testHypotenuseCalculation(){
        assertEquals(17,hypotenuseCalculation.calculateHypotenuse(8.0,15.0));
        }
    }
