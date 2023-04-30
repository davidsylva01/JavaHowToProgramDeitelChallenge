package deitelJavaHowToProgramChallenge.chapter3.petrolTask;

public class Petrol {
    public static void main(String[] args) {


        PetrolPurchase petrolPurchase = new PetrolPurchase("Sabo", "PMS", 50, 500.0, 20);
        System.out.println( petrolPurchase.getPurchaseAmount());
    }
}