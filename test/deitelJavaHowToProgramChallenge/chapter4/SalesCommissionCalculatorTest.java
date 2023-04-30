package deitelJavaHowToProgramChallenge.chapter4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SalesCommissionCalculatorTest {
    SalesCommissionCalculator scc;

    @Test
    @BeforeEach
    void setUp(){
        scc = new SalesCommissionCalculator();
    }
    @Test
    void testEarningsCalculation(){
        Assertions.assertEquals(209, scc.calculateSalesPersonsEarnings(50,20,30));
    }
}
