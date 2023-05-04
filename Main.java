public class Main {
    
    public static void main(String args[])
    {
        DataSet data = new DataSet(5+1,10);
        data.generateDirectLinks(-1);
        data.generateCrossLinks();
        System.out.print("Nodes:"+"\n");
        for(int i=0;i<data.total_num_of_v;i++)
        {
            System.out.println(data.arr_V[i].VtoString());
        }
        for(int i=0;i<data.total_num_of_v;i++)
        {
            System.out.println(data.arr_V[i].EdgetoString());
        }

    }
}
