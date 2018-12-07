import java.util.Scanner;
public class MergeSorted {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		// list 1
		System.out.print("Enter list1: ");
		int size1 = input.nextInt();
		int[] list1 = new int[size1];
		for(int i = 0; i<list1.length; i++){
			list1[i] = input.nextInt();
		}
		// list 2
		System.out.print("Enter list2: ");
		int size2 = input.nextInt();
		int[] list2 = new int[size2];
		for(int i = 0; i<list2.length; i++){
			list2[i] = input.nextInt();
		}
		// merge
		int[] merged = new int[list1.length + list2.length];
		merged = merge(list1, list2);
		sortIt(merged);
		System.out.print("The merged list is ");
		display(merged);
		input.close();
	}
	
	private static void sortIt(int[] list){
		int minIndex;
		for(int i = 0; i<list.length; i++){
			minIndex = findMin(list, i);
			swap(list, i, minIndex);
		}
	}
	
	private static void swap(int[] list, int i, int minIndex) {
		int temp = list[i];
		list[i] = list[minIndex];
		list[minIndex] = temp;		
	}

	private static int findMin(int[] list, int start) {
		int minIndex = start;
		for(int i = start +1; i<list.length; i++){
			if(list[i] < list[minIndex]){
				minIndex = i;
			}
		}
		return minIndex;
	}

	private static void display(int[] merged) {
		for(int i = 0; i < merged.length; i++){
			System.out.print(merged[i] + " ");
		}
	}
	
	public static int[] merge(int[] list1, int[] list2){
		int[] merged = new int[list1.length + list2.length];
		for(int i=0; i < list1.length; i++){
			merged[i] = list1[i];
		}
		for(int i = list1.length; i < merged.length; i++){
			merged[i] = list2[i-list1.length];
		}
		return merged;
	}
}
