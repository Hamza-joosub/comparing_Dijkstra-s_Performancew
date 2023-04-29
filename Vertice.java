import java.util.ArrayList;

public class Vertice 

{
    String name;
    ArrayList<Edge> edges = new ArrayList<>(0);

    public Vertice(String name)
    {
        this.name = name;
    }
    public void addEdge(Edge edge)
    {
        edges.add(edge);
    }
    public void generate_V_and_E(Vertice[] arr_V, Edge[] arr_E)  
    {
        for (int i = 0;i < arr_V.length;i++)
        {
            for (int j= 0;j<3;j++)//generate and add edges to vertice
            {
                arr_V[i].addEdge(new Edge(arr_V[i],null,2));
            } 
        }

    }
}