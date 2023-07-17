# Linked Lists

- **Intro**
    
    Difference between array lists and linked lists
    
    Linked lists are more commonly compared to array lists because linked lists are dynamic in length just like array lists, where arrays are fixed in length
    
    - No indexes where we can go directly to a particular item
    - Instead of all of these being in a contiguous place in memort, they are going to be spread out
    - Has a variable called head that points to the first node and one called tail points to the last node. Both of these variables are pointers that point to the nodes. Each node has a pointer that points to the next node and so on. Last node also has a pointer and it points to null.
- **Big O**
    
    From big O perspective,N is the number of nodes. 
    
    - Add a node at the end = **O(1)** Fixed number of steps
    - Remove a node at the end = **O(n)**. In order to move tail over to point at a node, you need a pointer that is already pointing to that node. So we need to start at the head and iterate through the list until we get to that pointer. The set tail equal to that pointer. Since we have to touch every node and iterate through the list. It is O(n)
    - Add a node at the other end = **O(1)** Fixed number of steps
    - Remove a node at the other end = **O(1)** Fixed number of steps. This is a place where linked lists are better than array. Array lists are O(n) when removing the first item because of the reindexing that is required.
    - Insert a node. **O(n)**
    - Remove a node in the middle. **O(n)**
    - Look for a node by index/value. **O(n)**
- **Under the hood**
    
    Node includes both value and pointer
    
- **Constructor**
    
    ```java
    
    class Node {
    	int value;
    	Node next;
    	Node(int value) {
    		this.value = value;
    	}
    }
    public class LinkedList {
    	private Node head;
    	private Node tail;
    	private int length;
    	
    	public LinkedList(int value) {
    		Node newNode = new Node(value);
    		head = newNode;
    		tail = newNode;
    		length = 1;
    	}
    
    	LinkedList myLinkedList = new LinkedList(4);
    	
    	public void append(int value) {}
    	public prepend(int value) {}
    	public boolean insert(int index, int value) {}
    }
    ```
    
- **Print List**
    
    ```java
    public void printList() {
    	Node temp = head;
    	while(temp != null) {
    		System.out.println(temp.value);
    		temp = temp.next;
    	}
    }
    ```
    
- **Append**
    
    ```java
    public void append(int value) {
    	Node newNode = new Node(value);
    	if(length == 0) {
    		head = newNode;
    		tail = newNode;
    	}
    	else {
    		tail.next = newNode;
    		tail = newNode;
    	}
    	length++;
    }
    ```
    
- **Remove Last**
    
    ```java
    public Node removeLast() {
            if (length == 0) return null;
            Node temp = head;
            Node pre = head;
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if (length == 0){
                head = null;
                tail = null;
            }
            return temp;
        }
    ```
    
- **Prepend**
    
    ```java
    public void prepend(int value) {
    	Node newNode = new Node(value);
    	if(length == 0) {
    	  head = newNode;
        tail = newNode;
    	} else {
    	  newNode.next = head;
        head = newNode;
    	}
    	length++;
    }
    ```
    
- **Remove First**
    
    ```java
    public Node removeFirst() {
    	if (length == 0) return null;
    	Node temp = head;
    	head = head.next;
    	temp.next = null;
    	length--;
    	if(length == 0) {
    		tail = null;
    	}
    }
    ```
    
- **Get**
    
    ```java
    public Node get(int index) {
    	if (index < 0 || index > length) return null;
    	Node temp = head;
    	for (i = 0; i < index; i++) {
    		temp = temp.next;
    	}
    	return temp;
    }
    ```
    
- **Set**
    
    ```java
    public boolean set(int index, int value) {
    	Node temp = get(index);
    	if (temp != null) {
    		temp.value = value;
    		return true
    	}
    	return false;
    }
    ```
    
- **Insert**
    
    ```java
    public boolean insert(int index, int value) {
    	if (index < 0 || index > length) return false;
    	if (index == 0) {
    		prepend(value);
    		return true;
    	}
    	if (index == length) {
    		append(value);
    		return true;
    	}
    	Node newNode = new Node(value);
    	Node temp = get(index - 1);
    	newNode.next = temp.next;
    	temp.next = newNode;
    	length++;
    	return true;
    
    }
    ```
    
- **Remove**
    
    ```java
    public Node remove(int index) {
    	if (index < 0 || index >= length) return null;
    	if (index == 0) return removeFirst();
    	if (index == length - 1) return removeLast();
    	Node prev = get(index - 1);
    	Node temp = prev.next;
    	prev.next = temp.next;
    	temp.next = null;
    	length--;
    	return temp;
    	
    }
    ```
    
- **Reverse**
    
    ```java
    public void reverse() {
    	Node temp = head;
    	head = tail;
    	tail = temp;
    	Node after = temp.next;
    	Node before = null;
    	for (int i = 0; i < length; i++) {
    		after = temp.next;
    		temp.next = before;
    		before = temp;
    		temp = after;
    	}
    }
    ```
    
- **Quiz**