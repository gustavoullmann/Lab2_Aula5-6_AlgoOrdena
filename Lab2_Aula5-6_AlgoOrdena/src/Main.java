public class Main {

	public static void main(String[] args) {
		
		int tamanhoArray = 100;
		
		System.out.println("\n" + "Array Shuffle");
		ArraysTeste arrayShuffle1 = new ArraysTeste(tamanhoArray);
		arrayShuffle1.fillArrayAscending();
		arrayShuffle1.randomizeArray();
		arrayShuffle1.printArray();
		System.out.println("\n" + "Ordenado Bubble Sort");
		arrayShuffle1.bubbleSort();
		arrayShuffle1.printArray();
		
		System.out.println("\n" + "Array Shuffle ");
		ArraysTeste arrayShuffle2 = new ArraysTeste(tamanhoArray);
		arrayShuffle2.fillArrayAscending();
		arrayShuffle2.randomizeArray();
		arrayShuffle2.printArray();
		System.out.println("\n" + "Ordenado Insert Sort");
		arrayShuffle2.insertSort();
		arrayShuffle2.printArray();

		System.out.println("\n" + "Array Shuffle ");
		ArraysTeste arrayShuffle3 = new ArraysTeste(tamanhoArray);
		arrayShuffle3.fillArrayAscending();
		arrayShuffle3.randomizeArray();
		arrayShuffle3.printArray();
		System.out.println("\n" + "Ordenado Selection Sort");
		arrayShuffle3.selectSort();
		arrayShuffle3.printArray();
		
		System.out.println("\n" + "Array Ascending");
		ArraysTeste arrayAscending1 = new ArraysTeste(tamanhoArray);
		arrayAscending1.fillArrayAscending();
		arrayAscending1.printArray();
		System.out.println("\n" + "Ordenado Bubble Sort");
		arrayAscending1.bubbleSort();
		arrayAscending1.printArray();
		
		System.out.println("\n" + "Array Ascending");
		ArraysTeste arrayAscending2 = new ArraysTeste(tamanhoArray);
		arrayAscending2.fillArrayAscending();
		arrayAscending2.printArray();
		System.out.println("\n" + "Ordenado Insertion Sort");
		arrayAscending2.insertSort();
		arrayAscending2.printArray();
		
		System.out.println("\n" + "Array Ascending");
		ArraysTeste arrayAscending3 = new ArraysTeste(tamanhoArray);
		arrayAscending3.fillArrayAscending();
		arrayAscending3.printArray();
		System.out.println("\n" + "Ordenado Selection Sort");
		arrayAscending3.selectSort();
		arrayAscending3.printArray();
		
		System.out.println("\n" + "Array Descending");
		ArraysTeste arrayDescending1 = new ArraysTeste(tamanhoArray);
		arrayDescending1.fillArrayDescending();
		arrayDescending1.printArray();
		System.out.println("\n" + "Ordenado Bubble Sort");
		arrayDescending1.bubbleSort();
		arrayDescending1.printArray();
		
		System.out.println("\n" + "Array Descending");
		ArraysTeste arrayDescending2 = new ArraysTeste(tamanhoArray);
		arrayDescending2.fillArrayDescending();
		arrayDescending2.printArray();
		System.out.println("\n" + "Ordenado Insertion Sort");
		arrayDescending2.insertSort();
		arrayDescending2.printArray();
		
		System.out.println("\n" + "Array Descending");
		ArraysTeste arrayDescending3 = new ArraysTeste(tamanhoArray);
		arrayDescending3.fillArrayDescending();
		arrayDescending3.printArray();
		System.out.println("\n" + "Ordenado Selection Sort");
		arrayDescending3.selectSort();
		arrayDescending3.printArray();
	}
}