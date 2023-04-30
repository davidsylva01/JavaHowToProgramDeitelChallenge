package deitelJavaHowToProgramChallenge.chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnforcingPrivacyWithCryptographyTest {
    EnforcingPrivacyWithCryptography privacy;
    @Test
    @BeforeEach
    void setUp(){
        privacy = new EnforcingPrivacyWithCryptography();
    }
    @Test
    void testSeparationOfDigits(){
        int[] separatedNumbers = {1,2,3,4};
        assertArrayEquals(separatedNumbers, EnforcingPrivacyWithCryptography.separateNumbers(1234));
    }
    @Test
    void testWeCanEncryptNumber(){
        int[] encryptedNumbers = {0,1,8,9};
        assertArrayEquals(encryptedNumbers,privacy.encryptNumbers(1234));
    }
    @Test
    void testWeCanDecrypt(){
        int[] encryptedNumber = {0,1,8,9};
        assertEquals(1234,privacy.decryptNumber(encryptedNumber));
    }
}
