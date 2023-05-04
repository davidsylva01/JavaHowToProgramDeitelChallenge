package deitelJavaHowToProgramChallenge.chapter6;

public class BinaryOctalHexadecimal {
    public static void main(String[] args) {
        System.out.println(convertBase10ToBase2(1128,16));
    }
    public static String convertBase10ToBase2(int number, int base) {
//        int binaryValue=2;
//        int octalValue = 8;
//        int hexValue =16;
        String tempConvert ="";
        String binary = "";
        while (number>0){
            tempConvert+=(number%base);
            number/=base;
        }
        for (int i=tempConvert.length()-1;i>=0;i--){
            binary+= tempConvert.charAt(i);
            }
        return binary;
    }
}