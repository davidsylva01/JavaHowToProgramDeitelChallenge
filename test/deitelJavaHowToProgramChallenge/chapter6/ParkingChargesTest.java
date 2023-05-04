package deitelJavaHowToProgramChallenge.chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingChargesTest {
    ParkingCharges charge;
    @Test
    @BeforeEach
    void setUp(){
        charge = new ParkingCharges();
    }
    @Test
    void testWeCanCalculateCharges(){
        assertEquals(8,charge.calculateCharge(15));
    }
}
