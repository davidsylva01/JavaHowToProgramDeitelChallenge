package deitelJavaHowToProgramChallenge.chapter5;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {
    public static void main(String[] args) {
        int correctCount = 0;
        String answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome. Answer true or false to the questions\n\n" +
                "1--> Wasting less food is a way to reduce greenhouse gas emissions\n" +
                "A--> True \t B--> False");
        answer = scanner.next();
        if (answer.toLowerCase().charAt(0)=='a'){
            System.out.println("Correct!\n" +
                    "More than a third of food produced globally never makes it to the table. Some of this wasted food spoils in transit, while consumers throw some of this food out. Approximately 8-10% of the world’s greenhouse gas emissions relate to food waste.\n" +
                    "\n");
            correctCount++;
        }else {
            System.out.println("incorrect" +
                    "\"More than a third of food produced globally never makes it to the table. Some of this wasted food spoils in transit, while consumers throw some of this food out. Approximately 8-10% of the world’s greenhouse gas emissions relate to food waste.\n");
        }
        System.out.println("Which of the following is a greenhouse gas?" +
                "A--> CO2\n" +
                "B--> CH4\n" +
                "C--> Water Vapor\n" +
                "D--> All of the above");
        answer=scanner.next();
        if (answer.toLowerCase().charAt(0)=='D'){
            System.out.println("Correct! Greenhouse gases may be a result of natural occurrence or human activity. These gases include carbon dioxide (CO2), methane (CH4), water vapor, nitrous oxide (N2O) and ozone (O3). Fluorinated gases are also considered to be greenhouse gases. Greenhouse gases act like a heat-trapping blanket, making the Earth habitable for humans. However, human activities have increased emissions of greenhouse gases into the atmosphere beyond what the Earth can support, resulting in climate change.");
            correctCount++;
        }else {
            System.out.println("incorrect! Greenhouse gases may be a result of natural occurrence or human activity. These gases include carbon dioxide (CO2), methane (CH4), water vapor, nitrous oxide (N2O) and ozone (O3). Fluorinated gases are also considered to be greenhouse gases. Greenhouse gases act like a heat-trapping blanket, making the Earth habitable for humans. However, human activities have increased emissions of greenhouse gases into the atmosphere beyond what the Earth can support, resulting in climate change.");
        }
        System.out.println("You scored"+correctCount);
    }
}
