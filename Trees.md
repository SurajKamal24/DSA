# Trees

- **Intro & Terminology**
    
    We have already seen a true i.e. linked list. A linked list is just a tree that doesn’t fork. A linked list node is similar to a hash map
    
    ```json
    {
    	"value": 4,
    	"next": null
    }
    ```
    
    In tree, node looks like below
    
    ```json
    {
    	"value": 4,
    	"left": null,
    	"right": null
    }
    ```
    
    Left and right pointer can point to new nodes. These new nodes can also point to two other nodes themselves
    
    ```json
    {
    	"value": 4,
    	"left": {
    		"value": 3,
    		"left": null,
    		"right": null
    	},
    	"right": {
    		"value": 23,
    		"left": null,
    		"right": null
    	}
    }
    ```
    
    Each node can only point to two node. That’s why it is called binary node.
    
    Full tree - Every node either points to zero nodes or two nodes
    
    Perfect tree - Any level in the tree that has any nodes is completely filled all the way across.
    
    Complete tree - With a complete tree, you are filling the tree from left to right with no gaps
    
    Parent and child (siblings) node. Every node can have only one parent. Child nodes can also be parent nodes. A node that doesn’t have any children is called a leaf. If a node has more than one parent, then it is not a tree.
    
- **Binary Search Tree: Example**
    
    In binary search tree, if you take any node in the binary search tree, all nodes below it to the right are going to be greater than that node. Everything on the left is going to be less than.
    
- **BST Big O**
    
    O(log n) - Achieved by divide and conquer
    
    Binary search tree - lookup(), insert(), remove() - O(log n)
    
    Linked list - lookup(), remove() - O(n) and insert() - O(1)
    
- **BST Constructor**
    
    ```java
    class Node {
    	int value;
    	Node left;
    	Node rigth;
    
    	Node(int value) {
    		this.value = value;
    	}
    }
    
    public class BinarySearchTree {
    	private Node root;
    }
    ```
    
- **BST Insert**
    
    Create newNode
    
    if root == null then root = newNode
    
    temp = root
    
    while loop
    
    if newNode == temp return false
    
    if < left else > right
    
    if null insert newNode else move to next
    
    ```java
    public boolean insert(int value) {
    	Node newNode = new Node(value);
    	if(root == null) {
    		root = newNode;
    		return true;
    	}
    	Node temp = root;
    	while (true) {
    		if (newNode.value == temp.value) return false;
    		if (newNode.value < temp.value) {
    			if (temp.left == null) {
    				temp.left = newNode;
    				return true;
    			}
    			temp = temp.left;
    		} else {
    				if (temp.right == null) {
    					temp.right = newNode;
    					return true;
    				}
    				temp = temp.right;
    			}
    	}
    }
    	
    ```
    
- **BST Contains**
    
    if root == null return false
    
    temp = root
    
    while temp ≠ null
    
    if < left
    
    else if if > right
    
    else == return true
    
    return false
    
    ```java
    public boolean contains(int value) {
    	Node temp = root;
    	
    	while (temp != null) {
    		if (value < temp.value) {
    			temp = temp.left;
    		} else if (value > temp.value) {
    			temp = temp.right;
    		} else {
    			return true;
    		}
    	}
    	return false;
    }
    ```