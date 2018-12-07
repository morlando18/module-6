import java.util.Scanner;
public class SortingTest {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list: ");
		int size = input.nextInt();
		int[] list = new int[size];
		for(int i = 0; i<list.length; i++){
			list[i] = input.nextInt();
		}
		if(isSorted(list))	
			System.out.println("The list is already sorted");
		else 
			System.out.println("The list is not sorted");
	}
	
	public static boolean isSorted(int[] list){
		boolean sorted = false;
		int start = list[0];
		for(int i =1; i<list.length; i++){
			if(start <= list[i]) {
				sorted = true;
				start = list[i];
			}else 
				sorted = false;
		}
		return sorted;
	}
}
