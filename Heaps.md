# Heaps

- **Intro**
    
    Heap is a lot like a binary search tree and a heap is a binary tree, but the numbers are laid out in a different way. In heap, each node has a value that is greater than each of its descendants, and because of that, the maximum value is always going to be at the top. A key characteristic of a heap is this tree will always be complete. Heap can have duplicates.
    
    Implement a heap with an array list without any node class.
    
    To find child node of a parent node
    
    left child = 2 * parent node
    
    right child = 2 * parent node + 1
    
    To find parent node of a child node
    
    parent of left child = left child / 2
    
    parent of right child = right child / 2
    
- **Insert**
    
    Add the new one at the end of the array list. Take the child node and check whether is greater than its parent node
    
    If greater, then swap child and parent node
    
    If not greater, break the loop
    
- **Helper Methods**
    
    ```java
    public class Heap {
    	private List<Integer> heap;
    	
    	public Heap() {
    		this.leap = new ArrayList<>();
    	}
    
    	public List<Integer> getHeap() {
    		return new ArrayList<>(heap);
    	}
    	
    	private int leftChild(int index) {
    		return 2 * index + 1;
    	}
    
    	private int rightChild(int index) {
    		return 2 * index + 2;
    	}
    
    	private int parent(int index) {
    		return (index - 1) / 2;
    	}
    
    	private void swap(int index1, int index2) {
    		int temp = heap.get(index);
    		heap.set(index1, heap.get(index2));
    		heap.set(index2, temp);
    	}
    }
    ```
    
- **Insert**
    
    ```java
    public class Heap {
    	public void insert(int value) {
    		head.add(value);
    		int current = heap.size() - 1;
    
    		while (current > 0 && heap.get(current) > heap.get(parent(current))) {
    			swap(current, parent(current));
    			current = parent(current);
    		}
    
    	}
    }
    ```
    
- **Remove**
    
    ```java
    public Integer remove() {
    	if (heap.size() == 0) {
    		return null;
    	}
    
    	if (heap.size() == 1) {
    		return heap.remove(0);
    	}
    
    	int maxValue = heap.get(0);
    	
    	heap.set(0, heap.remove(heap.size() - 1));
    	sinkDown(0);
    
    	return maxValue;
    	
    }
    ```
    
    **Sink Down**
    
    ```java
    public void sinkDown(int index) {
    	int maxIndex = index;
    
    	while (true) {
    		int leftIndex = leftChild(index);
    		int rightIndex = rightChild(index);
    
    		if (leftIndex < heap.size() &&  heap.get(leftIndex) > heap.get(maxIndex)) {
    			maxIndex = leftIndex;
    		}
    		
    		if(rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
    			maxIndex = rightIndex;
    		}
    		
    		if (maxIndex != index) {
    				swap(maxIndex, index);
    				index = maxIndex;
    		} else {
    			return;
    		}
    	}
    }
    ```
    
- **Priority queues**
    
    O(log n)