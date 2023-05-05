import java.util.Random;
public class DataSet 
{
    int total_num_of_v, total_num_of_e,num_of_v,num_of_e;
    String name = "Node";
    Vertice[] arr_V;
    Edge[] arr_E;
    Random rand = new Random();
    int random,randomSource,randomDestination;
    public DataSet(int total_num_of_v,int total_num_of_e)
    {   
        arr_V = new Vertice[total_num_of_v+1];
        arr_E = new Edge[total_num_of_e];
        this.total_num_of_v = total_num_of_v+1;
        this.total_num_of_e = total_num_of_e;
    }
    
    public void generate()
    {
        for (int i = 0;i<total_num_of_v;i++) //create all nodes
        {
            arr_V[i] = new Vertice("Node" + i);
        }
        for (int j = 0;j<=arr_V.length-1;j++) //add at least one edge to each node ignore last node
        {
            arr_V[j].addEdge(new Edge(arr_V[j],arr_V[generateRandomNumber(arr_V.length-1,j)],2));
        }
        for(int p = 0;p<(total_num_of_e-total_num_of_v+1);p++)//add edges to and from random vertices
        {
            randomSource = generateRandomNumber(arr_V.length-1, -1);
            randomDestination = generateRandomNumber(arr_V.length-1,randomSource);
            //arr_V[randomSource].edges.
            arr_V[randomSource].addEdge(new Edge(arr_V[randomSource], arr_V[randomDestination], 2));
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


/* 
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
            for (int j = 0; j<rand.nextInt(4);j++)
            {

            arr_V[i].addEdge(new Edge(arr_V[i], arr_V[generateRandomNumber(total_num_of_v,i)], 2));
            }

        }
    }
    */
