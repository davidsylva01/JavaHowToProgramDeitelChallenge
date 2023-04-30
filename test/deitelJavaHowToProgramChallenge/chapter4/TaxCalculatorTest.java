package deitelJavaHowToProgramChallenge.chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {
    TaxCalculator tc;
    @BeforeEach
    @Test
    void setUp(){
        tc = new TaxCalculator();
    }
    @Test
    void testTotalTaxCanBeCalculated(){
        assertEquals(8500,tc.getTotalTax(50000));
    }
}
