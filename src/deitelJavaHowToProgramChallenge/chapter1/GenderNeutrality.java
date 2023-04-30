package deitelJavaHowToProgramChallenge.chapter1;

import java.util.Scanner;

public class GenderNeutrality {
    public static void main(String[] args) {
        String newText = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Paste a string here");
        String text = scanner.nextLine();
        String[] splitted = text.split(" ");
        for (int i = 0; i< splitted.length; i++){
            if(splitted[i].toLowerCase().equals("wife"))splitted[i]="spouse";
            if( splitted[i].toLowerCase().equals("man"))splitted[i]= "person";
            if( splitted[i].toLowerCase().equals( "daughter")) splitted[i]="child";
            newText= newText + splitted[i] + " ";
        }
        System.out.println(newText);

        }
//        newText= newText + String.valueOf(Arrays.toString(splitted)) + " ";

    }

