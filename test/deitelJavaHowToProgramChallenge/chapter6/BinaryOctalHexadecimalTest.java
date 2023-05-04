package deitelJavaHowToProgramChallenge.chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryOctalHexadecimalTest {
    BinaryOctalHexadecimal conversion;

    @Test
    @BeforeEach
    void setUp(){
        conversion =new BinaryOctalHexadecimal();
    }
    @Test
    void testWeCanConvertBase10ToBinary(){
        assertEquals("1010",conversion.convertBase10ToBase2(10));
    }
    @Test
    void testWeCanConvertDecimalToOctal(){
       assertEquals(343,conversion.convertDecimalToOctal());
    }
}
