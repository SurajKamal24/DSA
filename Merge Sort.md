# Merge Sort

- **Merge Sort: Overview**
    
    Takes an array and cut it in half and then it will cut it in half again until we have a single item arrays. Then take two items and combine them into on larger sorted array and continue the same to get one big sorted array. Merge sort is the efficient sorting algorithm
    
- **Merge: Intro**
    
    Merge is helper which takes two sorted arrays and make one big sorted array. Two pointers in each sorted array (i & j) respectively.
    
    Compare i and j and lowest one pushed to a new array.
    
- **Merge: Code**
    
    ```java
    public static int[] merge(int[] array1, int[] array2) {
    	int[] combined = new int[array1.length + array2.length];
    	int index = 0;
    	int i = 0;
    	int j = 0;
    	while (i < array1.length && j < array2.length) {
    		if(array[i] < array[j]) {
    			combined[index] =  array1[i];
    			index++;
    			i++;
    		} else {
    			combined[index] =  array2[j];
    			index++;
    			j++;
    		}
    	}
    	while (i < array.length) {
    		combined[index] =  array1[i];
    		index++;
    		i++;
    	}
    	while (j < array.length) {
    		combined[index] =  array2[j];
    		index++;
    		j++;
    	}
    	return combined;
    }
    ```
    
- **Merge Sort: Intro**
    
    ```java
    public static int[] mergeSort(int[] array) {
    	if (array.length == 1) return array;
    	
    	int midIndex = array.length/2;
    	int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
    	int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
    
    	return merge(left, right);
    }
    ```
    
- **Merge Sort: Big O**
    
    Space complexity - O(n)
    
    Time complexity - O(n log n)