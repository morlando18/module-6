import java.util.Scanner;
public class Grading {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberStudents = input.nextInt();
		int[] score = new int[numberStudents];
		
		System.out.print("Enter " + numberStudents + " scores: " );
		for(int i = 0; i < numberStudents; i++){
			score[i] = input.nextInt();
		}
		
		int[] unsortedScore = copyArray(score);
		sort(score);
		char[] grades = grade(unsortedScore, score[score.length - 1]);
		display(grades, unsortedScore);
		input.close();
	}
	
	
	private static char[] grade(int[] unsortedScore, int max) {
		char[] grades = new char[unsortedScore.length];
			for(int i = 0; i < unsortedScore.length; i++){
				if(unsortedScore[i] >= max-10) grades[i] = 'A';
				else if(unsortedScore[i] >= max-20) grades[i] = 'B';
				else if(unsortedScore[i] >= max-30) grades[i] = 'C';
				else if(unsortedScore[i] >= max-40) grades[i] = 'D';
				else grades[i] = 'F';
			}
		return grades;
	}


	private static int[] copyArray(int[] score) {
		int[] cloneArray = new int[score.length];
		for(int i = 0; i<score.length; i++){
			cloneArray[i] = score[i];
		}
		return cloneArray;
	}

	private static void sort(int[] numbers){
		int minIndex;
		for(int i = 0; i<numbers.length; i++){
			minIndex = findMinIndex(numbers, i);
			swap(numbers, i, minIndex);
		}
	}

	private static void swap(int[] numbers, int i, int minIndex) {
		int temp = numbers[i];
		numbers[i] = numbers[minIndex];
		numbers[minIndex] = temp;
		
	}

	private static int findMinIndex(int[] numbers, int start) {
		int minIndex = start;
		for(int i = start + 1; i < numbers.length; i++){
			if(numbers[i] < numbers[minIndex]){
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	private static void display(char[] grades, int[] unsortedScore){
		for(int i = 0; i < grades.length; i++){
			System.out.println("Student " + i + " score is " + unsortedScore[i] + " and grade is " + grades[i]);
		}
	}
}
