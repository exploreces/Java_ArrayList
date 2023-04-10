



import java.util.*;

public class DFS {
    private int V; // number of vertices
    private LinkedList<Integer> adj[]; // adjacency list
    
    // constructor
    DFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
    
    // function to add an edge to the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    
    // function to perform DFS traversal
    void DFSUtil(int v, boolean visited[]) {
        // mark current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");
        
        // get all adjacent vertices of the current vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
    
    // function to perform DFS traversal starting from a given vertex
    void DFS(int v) {
        // mark all vertices as not visited
        boolean visited[] = new boolean[V];
        // create a stack for DFS
        Stack<Integer> stack = new Stack<Integer>();
        
        // push the current vertex onto the stack
        stack.push(v);
        
        // loop until the stack is empty
        while (!stack.empty()) {
            // pop a vertex from the stack and print it
            v = stack.pop();
            // mark the vertex as visited
            visited[v] = true;
            System.out.print(v + " ");
            
            // get all adjacent vertices of the popped vertex
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                // if the adjacent vertex is not visited, push it onto the stack
                if (!visited[n])
                    stack.push(n);
            }
        }
    }
    
    public static void main(String args[]) {
        DFS g = new DFS(5);
        
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        System.out.println("Depth First Traversal (starting from vertex 2):");
        g.DFS(2);
    }
}




