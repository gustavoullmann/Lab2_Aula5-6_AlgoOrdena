
public class SortAlgorithm {

	public static int[] bubbleSort(int[] list) {
		
		int swap = 0;
		
		for(int i = 0; i < list.length - 1; i++) {
			for(int j = 0; j < list.length - 1 - i; j++) {
				if(list[j] > list[j+1]) {
					swap = list[j];
					list[j] = list[j+1];
					list[j+1] = swap;
				}
			}
		}
		return list;
	}
	
	public static int[] insertSort(int[] list) {
		
		int swap = 0;
		int key = 0;
		
		for(int i = 1; i < list.length; i++) {
			
			key = list[i];
			int j = i - 1;
			
			while(j >= 0 && key < list[j]) {
				swap = list[j];
				list[j] = list[j+1];
				list[j+1] = swap;	
				j--;				
			}
		}		
		return list;
	}
	
	public static int[] selectSort(int[] list) {
		
		int minValue = 0;
		int minIndex = 0;
		int swap = 0;
		
		for(int i = 0; i < list.length; i++) {
		
			minValue = list[i];
			minIndex = i;
			
			for(int j = i; j < list.length; j++) {
				if(list[j] < minValue) {
					minValue = list[j];
					minIndex = j;
				}
			}
			if(minValue < list[i]) {
				swap = list[i];
				list[i] = list[minIndex];
				list[minIndex] = swap;
			}			
		}
		return list;
	}
}
