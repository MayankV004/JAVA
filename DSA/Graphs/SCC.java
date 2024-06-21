import java.util.*;
class SCC
{
    @SuppressWarnings("unchecked")
    static class Edge{
        int src ;
        int dest;
        public Edge(int src , int dest)
        {
            this.src = src;
            this.dest = dest;
        }
    }
    @SuppressWarnings("unchecked")
    public static void createGraph(ArrayList<Edge> graph[])
    {
        for (int i = 0 ; i < graph.length ; i++)
        {
           graph[i] = new ArrayList<Edge>(); 
        }

        graph[0].add(new Edge(0 , 3));
        graph[0].add(new Edge(0 , 2));

        graph[1].add(new Edge(1 , 0));

        graph[2].add(new Edge(2 , 1));

        graph[3].add(new Edge(3 , 4));
}
    public static void topSort(ArrayList<Edge> graph[] , boolean vis[] , int curr , Stack<Integer> s)
    {
        vis[curr] = true;
        for (int i = 0 ; i < graph[curr].size() ; i++)
        {
            Edge e = graph[curr].get(i);
            if (vis[e.dest] == false)
                topSort(graph , vis , e.dest , s);
        }
        s.push(curr);
    }

    public static void DFS(ArrayList<Edge> [] graph , boolean vis [] , int curr)
    {
        vis[curr] = true;
        System.out.print(curr +" ");
        for (int i = 0 ; i < graph[curr].size() ; i++)
        {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest])
            {
                DFS(graph , vis , e.dest);
            }
        }
    }


    public static void KosarajuAlgo(ArrayList<Edge> [] graph , int V)
    {
        // Step1 -> Do Topological sort O(V+E)
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];
        for (int i = 0 ; i < V ; i++)
        {
            if (!vis[i])
            {
                topSort(graph , vis , i , s);
            }
        }

        // Step2 -> Create Transpose Graph  O(V + E)
        ArrayList<Edge> Tranpose[] = new ArrayList[V];
        for (int i = 0 ; i < V ; i++)
        {   vis[i] = false; // reusing visited
            Tranpose[i] = new ArrayList<Edge>();
        }
        
        for (int i = 0 ; i < V ; i++)
        {
            for (int j = 0 ; j < graph[i].size() ; j++)
            {
                Edge e = graph[i].get(j);  // e.src(i) -> e.dest
                Tranpose[e.dest].add(new Edge(e.dest , e.src));
            }
        }
        // Step3 -> Do DFS according to the stack nodes  O(V+E)

        while(!s.isEmpty())
        {
            int curr = s.pop();
            if (!vis[curr])
            {
                DFS(Tranpose, vis , curr);
                System.out.println();
            }
        }

    }

    @SuppressWarnings("unchecked")
    public static void main(String [] args)
    {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        KosarajuAlgo(graph , V);

    }
}