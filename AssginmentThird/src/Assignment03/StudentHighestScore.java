package Assignment03;
import java.util.Scanner;
public class StudentHighestScore {

      StudentHighestScore(){
    }
    public static void main(String[] args) {
        int classSize,student;
        double studentGrade,grade=0;
        String name,highName;



        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of students.");

                classSize = keyboard.nextInt();
                student = 1;
                highName = " ";
                while(student <= classSize){
                    System.out.print("Enter the student's name:");
                    name = keyboard.next();

                    System.out.print("Enter the student's grade.");
                    studentGrade = keyboard.nextDouble();

                    if(studentGrade > grade) {
                        grade = studentGrade;
                        highName = name;
                    }
                    student++;
                }
                  System.out.print("The highest grade was " + grade + " achieved by " +highName);
            }
        }
/*
import java.util.Scanner;

public class Exercise_05_08 {
	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);

		int highestScore = 0; 			// Holds the hightest student score
		String highestScoreName = ""; // Holds the student name with highest score

		// Prompt the user to enter the number of students
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		// Prompt the user to enter each student's name and score
		System.out.println("Enter each student’s name and score");
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print(
				"Student: " + (i + 1) +
				"\n   Name: ");
			String name = input.next();
			System.out.print(
				"   Score: ");
			int score = input.nextInt();

			// Test if score is higher than highest score
			if (score > highestScore)
			{
				highestScore = score;
				highestScoreName = name;
			}

		}

		// Display the name of the student with the highest score
		System.out.println("Student with the highest score: " + highestScoreName);
	}
}
 */