public class Main {

	public static void main(String[] args) {
		
		int tamanhoArray = 10000;
		int quantExecucoes = 10;
		
		System.out.println("Arrays com " + tamanhoArray + " elementos");
				
			System.out.println("\n\t" + "Array Shuffle");
			
				ArraysTeste arrayShuffle1 = new ArraysTeste(tamanhoArray);
				
					System.out.println("\n\t\t" + "Método Bubble Sort:");
					
						for(int i = 1; i <= quantExecucoes; i++) {
							
							arrayShuffle1.fillArrayAscending();
							arrayShuffle1.randomizeArray();
				
							long startTime = System.currentTimeMillis();
							arrayShuffle1.bubbleSort();
							long endTime = System.currentTimeMillis();
						
							System.out.println("\t\t\t" + i + "- " + "\t" + (endTime - startTime) + "\t" + "milisegundos");
						}

				ArraysTeste arrayShuffle2 = new ArraysTeste(tamanhoArray);
					
					System.out.println("\n\t\t" + "Método Insertion Sort:");
					
						for(int i = 1; i <= quantExecucoes; i++) {
							
							arrayShuffle2.fillArrayAscending();
							arrayShuffle2.randomizeArray();
					
							long startTime = System.currentTimeMillis();
							arrayShuffle2.insertSort();
							long endTime = System.currentTimeMillis();
							
							System.out.println("\t\t\t" + i + "- " + "\t" + (endTime - startTime) + "\t" + "milisegundos");
						}
			
				ArraysTeste arrayShuffle3 = new ArraysTeste(tamanhoArray);
				
					System.out.println("\n\t\t" + "Método Selection Sort:");
					
						for(int i = 1; i <= quantExecucoes; i++) {
							
							arrayShuffle3.fillArrayAscending();
							arrayShuffle3.randomizeArray();
					
							long startTime = System.currentTimeMillis();
							arrayShuffle3.selectSort();
							long endTime = System.currentTimeMillis();
							
							System.out.println("\t\t\t" + i + "- " + "\t" + (endTime - startTime) + "\t" + "milisegundos");
						}
				
			System.out.println("\n\t" + "Array Ascending");
			
				ArraysTeste arrayAscending1 = new ArraysTeste(tamanhoArray);
				
					System.out.println("\n\t\t" + "Método Bubble Sort:");
					
						for(int i = 1; i <= quantExecucoes; i++) {
									
							arrayAscending1.fillArrayAscending();
							
							long startTime = System.currentTimeMillis();
							arrayAscending1.bubbleSort();
							long endTime = System.currentTimeMillis();
							
							System.out.println("\t\t\t" + i + "- " + "\t" + (endTime - startTime) + "\t" + "milisegundos");
						}
							
				ArraysTeste arrayAscending2 = new ArraysTeste(tamanhoArray);
				
					System.out.println("\n\t\t" + "Método Insertion Sort:");
					
						for(int i = 1; i <= quantExecucoes; i++) {
					
							arrayAscending2.fillArrayAscending();
							long startTime = System.currentTimeMillis();
							arrayAscending2.insertSort();
							long endTime = System.currentTimeMillis();
							
							System.out.println("\t\t\t" + i + "- " + "\t" + (endTime - startTime) + "\t" + "milisegundos");
						}
			
				ArraysTeste arrayAscending3 = new ArraysTeste(tamanhoArray);
				
					System.out.println("\n\t\t" + "Método Selection Sort:");
					
						for(int i = 1; i <= quantExecucoes; i++) {
						
							arrayAscending3.fillArrayAscending();
							
							long startTime = System.currentTimeMillis();
							arrayAscending3.selectSort();
							long endTime = System.currentTimeMillis();
							
							System.out.println("\t\t\t" + i + "- " + "\t" + (endTime - startTime) + "\t" + "milisegundos");
						}	
				
			

			System.out.println("\n\t" + "Array Descending");
								
				ArraysTeste arrayDescending1 = new ArraysTeste(tamanhoArray);
				
					System.out.println("\n\t\t" + "Método Bubble Sort:");
					
						for(int i = 1; i <= quantExecucoes; i++) {
						
							arrayDescending1.fillArrayDescending();
													
							long startTime = System.currentTimeMillis();
							arrayDescending1.bubbleSort();
							long endTime = System.currentTimeMillis();
							
							System.out.println("\t\t\t" + i + "- " + "\t" + (endTime - startTime) + "\t" + "milisegundos");				
						}
						
				ArraysTeste arrayDescending2 = new ArraysTeste(tamanhoArray);
				
					System.out.println("\n\t\t" + "Método Inserting Sort:");
					
						for(int i = 1; i <= quantExecucoes; i++) {
						
							arrayDescending2.fillArrayDescending();
					
							long startTime = System.currentTimeMillis();
							arrayDescending2.insertSort();
							long endTime = System.currentTimeMillis();
					
							System.out.println("\t\t\t" + i + "- " + "\t" + (endTime - startTime) + "\t" + "milisegundos");
						}
							
				ArraysTeste arrayDescending3 = new ArraysTeste(tamanhoArray);
				
					System.out.println("\n\t\t" + "Método Inserting Sort:");
						
						for(int i = 1; i <= quantExecucoes; i++) {
					
							arrayDescending3.fillArrayDescending();
					
							long startTime = System.currentTimeMillis();
							arrayDescending3.selectSort();
							long endTime = System.currentTimeMillis();
					
							System.out.println("\t\t\t" + i + "- " + "\t" + (endTime - startTime) + "\t" + "milisegundos");
						}	
	}
}