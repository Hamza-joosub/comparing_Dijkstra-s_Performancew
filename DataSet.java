public class DataSet 
{
    int total_num_of_v, total_num_of_e,num_of_v,num_of_e;
    String name = "Node";
    Vertice[] arr_V;
    Edge[] arr_E;
    int count = -1;
    public DataSet(int total_num_of_v,int total_num_of_e)
    {   
        arr_V = new Vertice[total_num_of_v];
        arr_E = new Edge[total_num_of_e];
        this.total_num_of_v = total_num_of_v;
        this.total_num_of_e = total_num_of_e;
    }
    public Vertice generateHelper()
    {
        if(count != total_num_of_v-1 )
        {
        count++;
        arr_V[count] = new Vertice("Node"+count);
        arr_V[count].addEdge(new Edge(arr_V[count],generateHelper(),2));
        
        }
        else
        {

        }
        return arr_V[count];
    } 
}
