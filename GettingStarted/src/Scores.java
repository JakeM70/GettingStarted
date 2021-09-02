
/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Sep 1, 2021
 */
import java.util.Scanner;
import java.util.Arrays;


public class Scores {

	public static void main(String[] args) {
		
		String testName;
		int numOfScores = 0;
		int[] scores;
		
		
		
		
		System.out.println("Please enter the name of the test: ");
		Scanner scan = new Scanner(System.in);
		testName = scan.next();
		
		System.out.println("Enter the number of scores you would like to input: ");
		numOfScores = scan.nextInt();
		scores = new int[numOfScores];
		
		for(int i =0; i<numOfScores; i++) {
			System.out.println("Enter score: ");
			scores[i] = scan.nextInt();
		}
		
		GradeBook gradeBook = new GradeBook(testName, scores);
		
		System.out.println("Score ------ Grade");
		for (int i=0; i<numOfScores; i++) {
			System.out.println("    "+scores[i] + "------" + gradeBook.setLetterGrades(scores)[i]);
		}		
		
	}
	
}
