package deitelJavaHowToProgramChallenge.chapter4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;


public class CreditLimitCalculatorTest {
    CreditLimitCalculator calculator;

    @Test
    @BeforeEach
    public void createNewCLCalculator() {
        calculator = new CreditLimitCalculator();
    }

    @Test
    public void testWeCanCalculateNewBalance() {
        Assertions.assertEquals(30, calculator.calculateNewBalance(50, 10, 30, 20, 40));
    }

//    @Test
//    void testCustomerLimit() {
//
//    }
}