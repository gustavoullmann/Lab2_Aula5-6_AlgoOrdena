import java.util.Random;
	
public class ArraysTeste {

	public int[] array;

	public ArraysTeste(int tamanho) {
		this.array = new int[tamanho];
	}
	
	public void fillArrayAscending() {
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}
	
	public void fillArrayDescending() {

		for(int i = 0; i < array.length; i++) {
			int temp = array.length - 1 - i;
			array[i] = temp;
		}
	} 
	
	public void randomizeArray() {
		
		Random randomNumGen = new Random();			
 
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = randomNumGen.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;		    
		}	
	}
	
	public void printArray() {
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public void bubbleSort() {
		
		int swap = 0;
		
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1 - i; j++) {
				if(array[j] > array[j+1]) {
					swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
	}
	
	public void insertSort() {
		
		int swap = 0;
		int key = 0;
		
		for(int i = 1; i < array.length; i++) {
			
			key = array[i];
			int j = i - 1;
			
			while(j >= 0 && key < array[j]) {
				swap = array[j];
				array[j] = array[j+1];
				array[j+1] = swap;	
				j--;				
			}
		}		
	}
	
	public void selectSort() {
		
		int minValue = 0;
		int minIndex = 0;
		int swap = 0;
		
		for(int i = 0; i < array.length; i++) {
		
			minValue = array[i];
			minIndex = i;
			
			for(int j = i; j < array.length; j++) {
				if(array[j] < minValue) {
					minValue = array[j];
					minIndex = j;
				}
			}
			if(minValue < array[i]) {
				swap = array[i];
				array[i] = array[minIndex];
				array[minIndex] = swap;
			}			
		}
	}
}
