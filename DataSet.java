public class DataSet 
{
    int total_num_of_v, total_num_of_e,num_of_v,num_of_e;
    String name = "Node";
    Vertice[] arr_V;
    Edge[] arr_E;
    int count = 0;
    public DataSet(int total_num_of_v,int total_num_of_e)
    {   
        arr_V = new Vertice[total_num_of_v];
        arr_E = new Edge[total_num_of_e];

    }
    public Vertice generate()
    {
        if(count != total_num_of_v )
        {
        arr_V[count] = new Vertice("Node"+count);
        arr_V[count].addEdge(new Edge(arr_V[count],generate(),2));
        count++;
        }
        else
        {
            return arr_V[count];
        }
        return arr_V[count];
    } 
}
