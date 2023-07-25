# Graphs

Node or Vertex

Vertices. Between the vertices is edge or connection. A vertex can have multiple edges connected to other vertices. Edges can be weighted or non-weighted. All edges can be directional or bidirectional. Trees are a form of graphs, but they have the limitation that each node can only point to two other nodes. Linked lists are a form of a tree, and a tree is a form of a graph. Therefore a linked list is a form of a graph with the limitation that they can only point to one other.

- **Adjacency Matrix**
    
    Going to be stored in a two dimensional array
    
    [https://witeboard.com/6ebbed10-2b03-11ee-ad42-190bb0fdc1be](https://witeboard.com/6ebbed10-2b03-11ee-ad42-190bb0fdc1be)
    
- **Adjacency List**
    
    [https://witeboard.com/02ee8140-2b05-11ee-b399-8b675e4f4998](https://witeboard.com/02ee8140-2b05-11ee-b399-8b675e4f4998)
    
- **Big O**
    
    Creating a vertex
    
    Adjacency Matrix - O(v ^ 2)
    
    Adjacency List - O(|v| + |e|)
    
    Creating edges for the vertex
    
    Adjacency Matrix - O(1)
    
    Adjacency List - O(1)
    
    Remove edges
    
    Adjacency Matrix - O(e)
    
    Adjacency List - O(1)
    
    Remove vertex
    
    Adjacency Matrix - O(v * e)
    
    Adjacency List - O(v ^ 2)
    
- **Add vertex**
    
    ```java
    public class Graph {
    	private HashMap<String, ArrayList<String>> adjList = new HashMap<>();
    	
    	public boolean addVertex(String vertex) {
    		if(adjList.get(vertex) == null) {
    			adjList.put(vertex, new ArrayList<String>());
    			return true;
    		}
    		return false;
    	}
    }
    ```
    
- **Add Edge**
    
    ```java
    public boolean addEdge(String vertex1, String vertex2) {
    	if(adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
    		adjList.get(vertex1).add(vertex2);
    		adjList.get(vertex2).add(vertex1);
    		return true;
    	}
    	return false;
    }
    ```
    
- **Remove Edge**
    
    ```java
    public boolean removeEdge(String vertex1, String vertex2) {
    	if(adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
    		adjList.get(vertex1).remove(vertex2);
    		adjList.get(vertex2).remove(vertex1);
    		return true;
    	}
    	return false;
    }
    ```
    
- **Remove vertex**
    
    ```java
    public boolean removeVertex(String vertex) {
    	if(adjList.get(vertex) == null) return false;
    	for (String otherVertex : adjList.get(vertex)) {
    		adjList.get(otherVertex).remove(vertex);
    	}
    	adjList.remove(vertex);
    	return true;
    }
    ```
    
- **Quiz Big O**