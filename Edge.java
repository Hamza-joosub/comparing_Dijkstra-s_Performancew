public class Edge 

{
    Vertice source;
    Vertice destination;
    int weight;
    public Edge(Vertice source, Vertice destination,int weight)
    {
         this.source = source;
         this.destination = destination;
         this.weight = weight;
    }
    public String edgeToString()
    {
        return "Source: " + source.VtoString() + " Destination: " + destination.VtoString() + " Weight: " + weight;



    }
    



}
