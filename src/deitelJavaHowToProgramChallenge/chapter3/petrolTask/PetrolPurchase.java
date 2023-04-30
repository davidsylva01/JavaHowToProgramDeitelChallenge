package deitelJavaHowToProgramChallenge.chapter3.petrolTask;

public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int quantityInLitres;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String petrolType, int quantityInLitres, double pricePerLitre, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantityInLitres = quantityInLitres;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantityInLitres() {
        return quantityInLitres;
    }

    public void setQuantityInLitres(int quantityInLitres) {
        this.quantityInLitres = quantityInLitres;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
    public double getPurchaseAmount(){
        double netPurchaseAmount = (quantityInLitres * pricePerLitre) - ((percentageDiscount/100)* (quantityInLitres * pricePerLitre));
        return netPurchaseAmount;
    }
}
