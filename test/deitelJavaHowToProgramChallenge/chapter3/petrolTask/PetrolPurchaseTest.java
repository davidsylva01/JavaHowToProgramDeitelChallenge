package deitelJavaHowToProgramChallenge.chapter3.petrolTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {
    PetrolPurchase petrolPurchase;
    @Test
    @BeforeEach
    public void petrolPurchaseInitializationTest(){
        petrolPurchase = new PetrolPurchase("yaba", "diesel", 20, 10, 10);
        assertNotNull(petrolPurchase);
    }

    @Test
    public void getLocationTest(){
        petrolPurchase.setStationLocation("Lagos");
        assertEquals("Lagos", petrolPurchase.getStationLocation());
    }

    @Test
    public void getPetrolTypeTest(){
        petrolPurchase.setPetrolType("diesel");
        assertEquals("diesel", petrolPurchase.getPetrolType());
    }

    @Test
    public void getQuantityTest(){
        petrolPurchase.setQuantityInLitres(50);
        assertEquals(50, petrolPurchase.getQuantityInLitres());
    }

    @Test
    public void getPricePerLitreTest(){
        petrolPurchase.setPricePerLitre(100);
        assertEquals(100, petrolPurchase.getPricePerLitre());
    }

    @Test
    public void getPercentageDiscountTest(){
        petrolPurchase.setPercentageDiscount(5);
        assertEquals(5, petrolPurchase.getPercentageDiscount());
    }

    @Test
    public void netPurchaseAmountTest(){
        petrolPurchase.getPurchaseAmount();
        assertEquals(180, petrolPurchase.getPurchaseAmount());
    }
}