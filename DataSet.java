import java.util.ArrayList;
import java.util.Random;
public class DataSet 
{
    int total_num_of_v, total_num_of_e,num_of_v,num_of_e,random,randomSource,randomDestination ;
    String name = "Node";
    Vertex[] arr_V;
    Edge[] arr_E;
    Random rand = new Random();
    ArrayList<String> existingDestinations = new ArrayList<>(1);
    public DataSet(int total_num_of_v,int total_num_of_e)
    {   
        arr_V = new Vertex[total_num_of_v+1];
        arr_E = new Edge[total_num_of_e];
        this.total_num_of_v = total_num_of_v+1;
        this.total_num_of_e = total_num_of_e;
    }
    
    public void generate()
    {
        for (int i = 0;i<total_num_of_v;i++) //create all nodes
        {
            arr_V[i] = new Vertex("Node" + i);
        }
        for (int j = 0;j<=arr_V.length-1;j++) //add at least one edge to each node ignore last node
        {
            arr_V[j].adj(new Edge(arr_V[j],arr_V[generateRandomNumber(arr_V.length-1,j)],rand.nextInt((9) + 1) + 1));
        }
        for(int p = 0;p<(total_num_of_e-total_num_of_v+1);p++)//add edges to and from random vertices
        {
            randomSource = generateRandomNumber(arr_V.length-1, -1);
            existingDestinations = arr_V[randomSource].getExistingDesination();
            randomDestination = generateRandomNumber(arr_V.length-1,randomSource);
            
            for(int k = 0;k<existingDestinations.size();k++)
            {
                if(arr_V[randomDestination].VtoString().equals(existingDestinations.get(k)))
                {
                randomDestination = generateRandomNumber(arr_V.length-1,randomSource);
                }
                if(arr_V[randomDestination].VtoString().equals(arr_V[randomDestination].VtoString()))
                {
                    randomDestination = generateRandomNumber(arr_V.length-1,randomSource);
                }
            }
            arr_V[randomSource].adj(new Edge(arr_V[randomSource], arr_V[randomDestination], rand.nextInt((9) + 1) + 1));
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

