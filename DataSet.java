public class DataSet 
{
    int total_num_of_v, total_num_of_e,num_of_v,num_of_e;
    String name = "Node";
    Vertice[] arr_V;
    Edge[] arr_E;

    public DataSet(int total_num_of_v,int total_num_of_e)
    {
        for (int i = 0;i<total_num_of_v-1;i++)
        {
            arr_V[i] = new Vertice(name + i);
        }
        
        arr_E = new Edge[total_num_of_e];  
    }
         
}
