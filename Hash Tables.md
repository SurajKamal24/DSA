# Hash Tables

- **Intro**
    
    
- **Collisions**
    
    
- **Constructor**
    
    ```java
    public class HashTable {
    	private int size = 7;
    	private Node[] dataMap;
    
    	public class Node {
    		private String key;
    		private int value;
    		private Node next;
    
    		public Node(String key, int value) {
    			this.key = key;
    			this.value = value;
    		}
    		}
    	
    	public HashTable() {
    		dataMap = new Node[size];
    	}
    	
    }
    ```
    
- **Hash Method**
    
    ```java
    private int hash(String key) {
    	int hash = 0;
    	char[] keyChars = key.toCharArray();
    	for (int i = 0; i < keyChars.length; i++) {
    		int asciiValue = keyChars[i];
    		hash = (hash + asciivalue * 23) % dataMap.length; 
    	}
    	return hash;
    }
    ```
    
- **Hash Set**
    
    ```java
    public void set(String key, int value) {
    	int index = hash(key);
    	Node newNode = new Node(key, value);
    	if(dataMap[index] == null) {
    		dataMap[index] = newNode;
    	} else {
    		Node temp = dataMap[index];
    		while (temp.next != null) {
    			temp = temp.next;
    		}
    		temp.next = newNode;
    	}
    }
    ```
    
- **Hash Get**
    
    ```java
    public int get(String key) {
    	int index = hash(key);
    	Node temp = dataMap[index];
    	while (temp != null) {
    		if (temp.key == key) return temp.value;
    		temp = temp.next;
    	}
    	return 0;
    }
    ```
    
- **Hash Keys**
    
    ```java
    public ArrayList keys() {
    	ArrayList<String> allKeys = new ArrayList<>();
    
    	for (int i = 0; i < dataMap.length; i++) {
    		Node temp = dataMpa[i];
    		while (temp != null) {
    			allKeys.add(temp.key);
    			temp = temp.next;
    		}
    	}
    
    	return allKeys;
    }
    ```
    
- **Big O**
    
    Hash method is always (Getting and setting an item)- O(1)
    
- **Interview Questions**
    
    Common items in two arrays
    
    Inefficient solution
    
    ```java
    public static boolean itemInCommon (int[] array1, int[] array2) {
    	for (int i : array1) {
    		for (int j : array2) {
    			if (i == j) return true;
    		}
    	}
    	return false;
    }
    ```
    
    Efficient solution
    
    ```java
    public static boolean itemInCommon (int[] array1, int[] array2) {
    	HashMap<Integer, Boolean> myHashMap = new HashMap<>();
    	for (int i : array1) {
    		myHashMap.put(i, true);
    	}
    	for (int j : array2) {
    		if(myHashMap.get(j) != null) return true;
    	}
    	return false;
    }
    ```