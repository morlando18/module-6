import java.util.Scanner;
public class Distinct {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] numbers = new int[10];
		for(int i=0; i< 10;i++){
			numbers[i] = input.nextInt();
		}
		
		for(int i=0; i<numbers.length; i++){
			subtrating(numbers, i);
		}
		System.out.println("The number of distinct number is " + distinct(numbers));
		System.out.print("The distinct numbers are: " );
		distinctDisplay(numbers);
		input.close();
	}
	
	private static void subtrating(int[] numbers, int index){
		for(int i=0; i<numbers.length;i++){
			if(numbers[index] == numbers[i] && numbers[i] != -1 && numbers[index] != -1 && index != i){
				numbers[i] = -1;
			}
		}
	}
	
	private static int distinct(int[] numbers){
		int counting = 0;
		for(int i = 0; i<numbers.length; i++){
			if(numbers[i] != -1){
			    counting++;
			}
		}
		return counting;
	}
	
	private static void distinctDisplay(int[] numbers){
		for(int i = 0; i<numbers.length; i++){
			if(numbers[i] != -1){
				System.out.print(numbers[i] + " ");
			}
		}
	}
}
