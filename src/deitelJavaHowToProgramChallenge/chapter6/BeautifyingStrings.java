package deitelJavaHowToProgramChallenge.chapter6;

public class BeautifyingStrings {
    public static void main(String[] args) {

        System.out.println(capitalizeFirstLetterOf("open."));
    }
    public static String capitalizeFirstLetterOf(String text){
        boolean isCapital=false;
        char firstLetter = text.charAt(0);
        String firstUpper="";
        if (firstLetter>64&&firstLetter<91){
//        if ((int)firstLetter>64&&(int)firstLetter<91){
            isCapital=true;
            System.out.println("First letter of "+text+" is capital");
        }else {
            System.out.println("converting to capital");
           firstUpper= text.substring(0,1).toUpperCase();
           text =firstUpper+text.substring(1,text.length());
        }


return text;
    }
    public static String checkFullStop(String word){
        if (!(word.endsWith(".")))word+=".";
//        if (word.charAt(word.length()-1)!='.')word.
        return word;
   }
}
