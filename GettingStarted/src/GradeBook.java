
/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Sep 1, 2021
 */
import java.util.Arrays;
public class GradeBook {

	private String testName;
	private int[] testScores;
	
	public GradeBook() {
		
	}
	
	public GradeBook(String testName, int[] testScores) {
		setTestName(testName);
		setTestScores(testScores);
	}

	public String getTestName() {
		return testName;
	}

	
	public void setTestName(String testName) {
		this.testName = testName;
	}

	
	public int[] getTestScores() {
		return testScores;
	}

	
	public void setTestScores(int[] testScores) {
		this.testScores = testScores;
	}
	public String[] setLetterGrades(int[] scores) {
		String[] grades = new String[scores.length];
		for(int i=0; i<scores.length; i++) {
			if(scores[i]>=89) {
				String gradeA = "A";
				grades[i] = gradeA;	
			}
			else if(scores[i]>=79) {
				String gradeB = "B";
				grades[i] = gradeB;
			}
			else if(scores[i] >=69) {
				String gradeC = "C";
				grades[i] = gradeC;
			}
			else if(scores[i]>=59) {
				String gradeD = "D";
				grades[i] = gradeD;
			}
			else {
				String gradeF = "F";
				grades[i] = gradeF;
			}
		}
		
		return grades;
	}
}
