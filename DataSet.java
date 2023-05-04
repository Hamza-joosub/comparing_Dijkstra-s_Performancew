import java.util.Random;
public class DataSet 
{
    int total_num_of_v, total_num_of_e,num_of_v,num_of_e;
    String name = "Node";
    Vertice[] arr_V;
    Edge[] arr_E;
    Random rand = new Random();
    int random;
    public DataSet(int total_num_of_v,int total_num_of_e)
    {   
        arr_V = new Vertice[total_num_of_v];
        arr_E = new Edge[total_num_of_e];
        this.total_num_of_v = total_num_of_v;
        this.total_num_of_e = total_num_of_e;
    }
    
    public Vertice generateDirectLinks(int count)
    {
        if(count != total_num_of_v-1)
        {
        count++;
        arr_V[count] = new Vertice("Node "+count);  
        arr_V[count].addEdge(new Edge(arr_V[count],generateDirectLinks(count),2));
        }
        else
        {
        }
        return arr_V[count];
    } 


    public void generateCrossLinks()
    {
        for (int i = 0;i<arr_V.length;i++)
        {   
            Vertice source = arr_V[i];
            Vertice destination = arr_V[i];





            /* 
            for (int j = 0; j<rand.nextInt(4);j++)
            {

            arr_V[i].addEdge(new Edge(arr_V[i], arr_V[generateRandomNumber(total_num_of_v,i)], 2));
            }
            */
        }
    }



    public int generateRandomNumber(int range, int exception)
    {
        random = rand.nextInt(range);
        while(random == exception)
        {
            random = rand.nextInt(range);
        }
        return random;
    }
}
