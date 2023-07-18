# Stacks & Queues

- **Stack Intro**
    
    Analogy - A can of tennis balls. The things that makes a stake a stake is you can only get to the last item that you pushed onto the stack As soon as you push that second one on, you can’t get to the first one without first removing the second one. The only one we can get to is the one that is on top. This called LIFO (Last In First Out).
    
    Example - Let’s say we have a web browser and we go to Facebook, and then after that we got to YouTube and then we go to Instagram and then we check our email. We have created is a stack of all of the previous websites that we have visited so when we hit the back button, we are popping an item off of the stack and it is only by removing that item that we can hit the back button again and again and get to the next item and so on.
    
    A common way of implementing a stack is with an array list. An ArrayList works better than an array here because we don’t know how many items we’re going to be adding to the stack. So it’s better to have a dynamic data structure. So technically we could use either end of the array list for adding and removing items. The only requirement for a stack is that we add and remove items from the same end. So if we do that at that end of the array list where I just did this, that is O(1) for both adding and removing items. However, if we do this on the other end and we’re going to remove this item because of all of the reindexing we have to do and also bringing that item back, we would have to re index this to push something back onto the stack. This ends up being O(n) for adding and removing from the stack if we do it at the end. So if you use an array list to implement your stack, you always want to do it on the end, not the beginning,
    
    So another way to implement a stack that is common and it is the way we will implement it here is with a linked list. And just like with an array list, you can add and remove items from either end as long as it’s the same end. Stack with the null terminated end at the bottom of the it or the other way. But from the big O perspective both adding and removing is O(1) from the start. So stack with the null terminated end at the bottom is efficient.
    
    Two methods used in linked list are leveraged for stack. Remove first and prepend change to pop and push respectively. Head and tail change to top and bottom as we represent a stack vertically
    
- **Constructor**
    
    ```java
    public class Stack {
    	private Node top;
    	private int height;
    
    	public stack(int value) {
    		Node newNode = new Node(value);
    		top = newNode;
    		height = 1;
    	}
    }
    ```
    
- **Push**
    
    ```java
    public void push(int value) {
    	Node newNode = new Node(value);
    	if(height == 0) {
    		top = newNode
    	} else {
    		newNode.next = top;
    		top = newNode;
    	}
    	height++;
    }
    ```
    
- **Pop**
    
    ```java
    public Node pop() {
    	if(height == 0) return null;
    	Node temp = top;
    	top = top.next;
    	temp.next = null;
    	height--;
    	return temp;
    }
    ```
    
- **Queues Intro**
    
    A queue is just like when you get in line, people can get in line behind you and then when you remove someone from the line, you take the first person in line out of the line. FIFO (First In First Out). Opposite to stacks which was last in first out. Insert node to a queue is enqueue and remove from a queue is dequeue.
    
    In case of Array Lists, O(1) on one side and O(n) on other side.
    
    In case of linked lists, O(1) for enqueue and dequeue on left side, O(1) for enqueue and O(n) for dequeue. Head and tail from linked lists renamed to first and last in queue respectively.
    
- **Constructor**
    
    ```java
    class Node {
    	int value;
    	Node next;
    
    	Node(int value) {
    		this.value = value;
    	}
    }
    
    public class Queue {
    	private Node first;
    	private Node last;
    	private int length;
    
    	public Queue(int value) {
    		Node newNode = new Node(value);
    		first = newNode;
    		last = newNode;
    		length = 1;
    	}
    }
    
    Queue myQueue = new Queue(7);
    ```
    
- **Enqueue**
    
    ```java
    public void enqueue(int value) {
    	Node newNode = new Node(value);
    	if(length == 0) {
    		first = newNode;
    		last = newNode;
    	} else {
    		last.next = newNode;
    		last = newNode;
    	}
    	length++;
    }
    ```
    
- **Dequeue**
    
    ```java
    public Node dequeue() {
    	if (length == 0) return null;
    	Node temp = first;
    	if (length == 1) {
    		first = null;
    		last = null;
    	} else {
    		first = first.next;
    		temp.next = null;
    	}
    	length--;
    	retutn temp;
    }
    ```
    
- **Quiz**
- **Coding exercises**
- **Interview Leetcode exercises**