


	import java.util.ArrayDeque;
	import java.util.ArrayList;
	import java.util.List;

	public class BFS {
	    
	    private int numVertices;
	    private List<Integer>[] adjList;
	    
	    public BFS(int numVertices) {
	        this.numVertices = numVertices;
	        adjList = new List[numVertices];
	        for (int i = 0; i < numVertices; i++) {
	            adjList[i] = new ArrayList<Integer>();
	        }
	    }
	    
	    public void addEdge(int src, int dest) {
	        adjList[src].add(dest);
	    }
	    
	    public void bfs(int startVertex) {
	        boolean[] visited = new boolean[numVertices];
	        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
	        
	        visited[startVertex] = true;
	        queue.add(startVertex);
	        
	        while (!queue.isEmpty()) {
	            int currVertex = queue.poll();
	            System.out.print(currVertex + " ");
	            
	            for (int adjVertex : adjList[currVertex]) {
	                if (!visited[adjVertex]) {
	                    visited[adjVertex] = true;
	                    queue.add(adjVertex);
	                }
	            }
	        }
	    }
	    
	    public static void main(String[] args) {
	        BFS graph = new BFS(6);
	        graph.addEdge(0, 1);
	        graph.addEdge(0, 2);
	        graph.addEdge(1, 3);
	        graph.addEdge(2, 3);
	        graph.addEdge(2, 4);
	        graph.addEdge(3, 4);
	        graph.addEdge(3, 5);
	        graph.addEdge(4, 5);
	        
	        System.out.println("BFS traversal starting from vertex 0:");
	        graph.bfs(0);
	    }
	}



