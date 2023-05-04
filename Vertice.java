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
    public String VtoString()
    {
        return name;
    }
    public String EdgetoString()
    {
        String temp = "";
        for(Edge edge:edges)
        {
            temp = temp + edge.edgeToString();
        }
        return temp;
    }
}