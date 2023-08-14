# Basic Sorts

- **Bubble Sort: Intro**
    
    Compare adjacent items and switch them if the second item is lesser than the first item. At the end of each iteration the largest item will be at the end and bubbled up for the next iteration
    
- **Bubble Sort: Code**
    
    ```java
    public static void bubbleSort(int[] array) {
    	for (int i = array.length - 1; i > 0; i--) {
    		for (int j = 0; j < i; j++) {
    			if (array[j] > array[j+1]) {
    				int temp = array[j];
    				array[j] = array[j+1];
    				array[j+1] = temp;
    			}
    		}
    	}
    }
    ```
    
- **Selection Sort: Intro**
    
    With selection sort, start with the first item and store its index in a variable. Check with every other item in the array, if any item is lesser than the first item then update the index variable with the lesser item index. At the end of the iteration, switch the first item with the item at the index stored in the variable.
    
- **Selection Sort: Code**
    
    ```java
    public static void selectionSort(int[] array) {
    	for (int i = 0; i < array.length; i++) {
    		int minIndex = i;
    		for (int j = i + 1; j < array.length; j++) {
    			if (array[j] < array[minIndex]) {
    				minIndex = j;
    			}
    		}
    		if (i != minIndex) {
    			int temp = array[i];
    			array[i] = array[minIndex];
    			array[minIndex] = temp;
    		}
    	}
    }
    ```
    
- **Insertion Sort: Intro**
    
    Always start with the second item and compare it with the item before. If it is less, then switch it.
    
- **Insertion Sort: Code**
    
    ```java
    public static void insertionSort(int[] array) {
    	for (int i = 1; i < array.length; i++) {
    		int temp = array[i];
    		int j = i - 1;
    		while (j > -1 && temp < array[j]) {
    			array[j+1] = array[j];
    			array[j] = temp;
    			j--;
    		}
    	}
    }
    ```
    
- **Insertion Sort: Big O**
    
    
- **Quiz7: Basic Sorts**