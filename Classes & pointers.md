# Classes & pointers

- **Classes**
    
    ```java
    public class Cookie {
    	private String color; //Classes can have class variables. A best practice to make all of your class variables private.
    	
    	public Cookie(String color) { //Inside the class, we can have methods, and the first method we create is called a constructor. The constructor method always has the name of the class.
    		this.color = color; //this.color corresponds to the private varibale color and it’s used for a particular instance of cookie.
    	}
    	
    	public String getColor() { // Returns the color for a particular instance of a cookie
    		return color;
    	}
    	
    	public void setColor(String color) { // It will change the color of a particular instance of the cookie
    		this.color = color;
    	}
    
    	Cookie cookieOne = new Cookie("green"); //Variable of the type Cookie. This particular instance of the Cookie is called cookieOne. It is of type cookie. new keyword is to run the constructor
    	Cookie cookieTwo = new Cookie("blue"); //This particular instance of the Cookie is called cookieTwo and it is blue.
    }
    ```
    
    ```java
    public class LinkedList {
    	public LinkedList(int value) {}
    	
    	public void append(int value) {}
    	
    	public Node removeLast() {}
    
    	public void prepend(int value) {}
    
    	public boolean insert(int index, int value) {}
    
    	public Node remove(int index) {}
    }
    ```
    
- **Pointers**
    
    ```java
    int num1 = 11;
    int num2 = num1; //It's only at the time of initialization
    
    num1 = 22;
    
    sout(22);
    sout(11);
    
    //This is how it works when you are not working with a pointer
    ```
    
    ```java
    map1 -> {"value"=11} //map1 points to this hashmap
    map2 = map1 //map2 points to the exact same hashap inmemory
    map1 & map2 -> {"value"=11}
    map1 -> {"value"=22}
    map1 & map2 -> {"value"=22}
    ```
    
    Pointers
    
    Hashmap
    
    Garbage collection