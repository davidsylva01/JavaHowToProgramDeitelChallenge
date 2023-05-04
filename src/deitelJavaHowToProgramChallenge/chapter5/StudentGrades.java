package deitelJavaHowToProgramChallenge.chapter5;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        int aGrade=0,bGrade=0,cGrade=0,dGrade=0,eGrade=0;
        Scanner scanner = new Scanner(System.in);

        for (int studentCount = 1; studentCount <= 5; studentCount++) {
            System.out.println("Enter Student name");
            String studentName = scanner.next();
            System.out.println("Enter student grade");
            String studentGrade = scanner.next();

            switch (studentGrade){
                case "A":
                    aGrade++;
                    break;
                case "B":
                    bGrade++;
                    break;
                case "C":
                    cGrade++;
                    break;
                case "D":
                    dGrade++;
            }
        }
        System.out.printf("The total number of students that scored A, B, C, D are %d, %d, %d, %d",aGrade,bGrade,cGrade,dGrade);
    }
}