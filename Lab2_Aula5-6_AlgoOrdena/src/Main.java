
public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n" + "Array Shuffle");
		ArraysTeste arrayShuffle1 = new ArraysTeste(10);
		arrayShuffle1.fillArrayAscending();
		arrayShuffle1.randomizeArray();
		arrayShuffle1.printArray();
		System.out.println("\n" + "Ordenado Bubble Sort");
		arrayShuffle1.bubbleSort();
		arrayShuffle1.printArray();
		
		System.out.println("\n" + "Array Shuffle ");
		ArraysTeste arrayShuffle2 = new ArraysTeste(10);
		arrayShuffle2.fillArrayAscending();
		arrayShuffle2.randomizeArray();
		arrayShuffle2.printArray();
		System.out.println("\n" + "Ordenado Insert Sort");
		arrayShuffle2.insertSort();
		arrayShuffle2.printArray();

		System.out.println("\n" + "Array Shuffle ");
		ArraysTeste arrayShuffle3 = new ArraysTeste(10);
		arrayShuffle3.fillArrayAscending();
		arrayShuffle3.randomizeArray();
		arrayShuffle3.printArray();
		System.out.println("\n" + "Ordenado Selection Sort");
		arrayShuffle3.selectSort();
		arrayShuffle3.printArray();
		

		
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
