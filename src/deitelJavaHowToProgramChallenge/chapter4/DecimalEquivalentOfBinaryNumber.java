package deitelJavaHowToProgramChallenge.chapter4;

public class DecimalEquivalentOfBinaryNumber {
    public static void main(String[] args) {
        System.out.println(getDecimalEquivalentOf(1111));
    }

    public static int getDecimalEquivalentOf(int binaryNumber) {
        String numChar = String.valueOf(binaryNumber);
        int numberLength = numChar.length() - 1;
        int controlCounter = 0;
        int decimal = 0;
        for (int i = numberLength; i >= 0; i--) {
            int positionValue = Integer.parseInt(String.valueOf(numChar.charAt(i)));
//            if (positionValue == 0 || positionValue == 1) isBinary=true;
//
//           if (isBinary){
            int numberValue = (positionValue * ((int) Math.pow(2, controlCounter)));
            decimal += numberValue;
            System.out.println(decimal);
            controlCounter++;
        }

        return decimal;
    }

}