import java.util.ArrayList;

public class Vertex 

{
    String name;
    ArrayList<Edge> edges = new ArrayList<>(0);

    public Vertex(String name)
    {
        this.name = name;
    }
    public void adj(Edge edge)
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
            temp = temp + "\n" + edge.edgeToString();
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