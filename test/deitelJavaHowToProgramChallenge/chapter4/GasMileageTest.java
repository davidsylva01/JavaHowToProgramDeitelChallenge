package deitelJavaHowToProgramChallenge.chapter4;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {
    GasMileage gasMileage;
    @BeforeEach
    void setUp(){
        gasMileage = new GasMileage(10,7);
    }
    @Test
    void testMilesPerGallonCalculation(){
        assertEquals(10/4,gasMileage.getMilesPerGallon(10,4));
    }
}