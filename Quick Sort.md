# Quick Sort

- **Quick Sort: Intro**
    
    Take a pivot point and compare it with every item in the array. If an item in the array is less than the pivot then exchange with the first item that is greater. Finally exchange the pivot with the last item lesser.
    
- **Pivot: Intro**
    
    Helper function for quick sort
    
    pivot and swap = first item
    
    i to loop through the array
    
    if ith item lesser than the pivot. Move the swap to the first greater item and then swap (swap and i)
    
    Finally swap (swap and pivot)
    
- **Pivot: Code**
    
    ```java
    private static void swap(int[] array, int firstIndex, int secondIndex) {
    	int temp = array[firstIndex];
    	array[firstIndex] = array[secondIndex];
    	array[secondIndex] = temp;
    }
    private static int pivot(int[] array, int pivotIndex, int endIndex) {
    	int swapIndex = pivotIndex;
    	for (int i = pivotIndex + 1; i <= endIndex; i++) {
    		if (array[i] < array[pivotIndex]) {
    			swapIndex++;
    			swap(array, swapIndex, i);
    		}
    	}
    	swap(array, pivotIndex, swapIndex);
    	return swapIndex;
    }
    ```
    
- **Quick Sort: Code**
    
    ```java
    public static void quickSort(int[] array, int left, int right) {
    	if (left < right) {
    		int pivotIndex = pivot(array, left, right);
    		quickSort(array, left, pivotIndex-1);
    		quickSort(array, pivotIndex+1, right);
    	}
    }
    ```
    
- **Quick Sort: Big 0**
    
    Time complexity (Best case) - O(n log n)
    
    Time complexity (Worst case in terms of sorted array) - O(n^2)