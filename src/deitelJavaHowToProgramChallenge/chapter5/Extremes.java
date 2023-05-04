package deitelJavaHowToProgramChallenge.chapter5;

public class Extremes {
    public static void main(String[] args) {
        System.out.println( findExtremes(1,2,4,7,-5,100,5,8));
    }
    public static String findExtremes(int...numbers){
        int smallestNumber = numbers[0];
        int largestNumber = numbers[0];
        String returnMessage = "The largest and smallest numbers are ";
        for (int number:numbers){
            if (number<smallestNumber)smallestNumber=number;
            if (number>largestNumber)largestNumber=number;
        }
        return returnMessage + largestNumber + " and "+smallestNumber;
    }
}
