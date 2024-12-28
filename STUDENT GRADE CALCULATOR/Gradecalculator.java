
package gradecalculator;

import java.util.Scanner;

public class Gradecalculator {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner o = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int Subjects = o.nextInt();
        int[] marks = new int[Subjects];
        int totalMarks = 0;
        for (int i = 0; i < Subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = o.nextInt();
            totalMarks += marks[i];
        }
        double average = (double) totalMarks / Subjects;
        char grade;
        if (average>= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average : " + average + "%");
        System.out.println("Grade: " + grade);

        o.close();
    }
}
    
    

