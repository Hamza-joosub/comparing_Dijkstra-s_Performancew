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
    public ArrayList<String> getExistingDesination()
    {
        ArrayList<String> destination= new ArrayList<>(1);
        for(Edge edge:edges)
        {
            destination.add(edge.destination.VtoString());
        }
        return destination;
    }
}