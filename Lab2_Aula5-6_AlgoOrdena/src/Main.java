
public class Main {

	public static void main(String[] args) {
		
		int[] list1 = new int[] {5, 9, 4, 2, 8, 1};
		int[] list2 = new int[] {5, 9, 4, 2, 8, 1};
		int[] list3 = new int[] {5, 9, 4, 2, 8, 1};
		
		SortAlgorithm.bubbleSort(list1);
		
		System.out.println("Bubble Sort:");
		for(int i = 0; i < list1.length; i++) {
			System.out.print(list1[i]);
		}
		
//		System.out.println();
//		
//		SortAlgorithm.insertSort(list2);
//		
//		System.out.println("Insertion Sort:");
//		for(int i = 0; i < list2.length; i++) {
//			System.out.print(list2[i]);
//		}
//		
//		System.out.println();
//		
//		SortAlgorithm.selectSort(list3);
//		
//		System.out.println("Selection Sort:");
//		for(int i = 0; i < list3.length; i++) {
//			System.out.print(list3[i]);
//		}

	}

}
