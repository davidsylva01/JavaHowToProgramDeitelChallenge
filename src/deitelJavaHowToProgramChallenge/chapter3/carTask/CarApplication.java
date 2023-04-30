package deitelJavaHowToProgramChallenge.chapter3.carTask;

public class CarApplication {
    public static void main(String[] args) {

        Car lexus = new Car("ES 350", "2023", 200000);
        Car benz = new Car("G-Wagon", "2023", 350000);

        System.out.println("The initial price of Lexus is "+ lexus.getPrice());
        System.out.println("The initial price of benz is "+ benz.getPrice());

        lexus.setPrice((lexus.getPrice() - 0.05 * lexus.getPrice()));
        benz.setPrice((benz.getPrice() -0.07 * benz.getPrice()));

        System.out.printf("The new prices of lexus and benz are %.2f and %.2f",lexus.getPrice(),benz.getPrice());
    }
}