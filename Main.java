public class Main {
    
    public static void main(String args[])
    {
        DataSet data1 = new DataSet(10,20);
        data1.generate();
        System.out.print("Nodes:"+"\n");
        for(int i=0;i<data1.total_num_of_v-1;i++)
        {
            System.out.println(data1.arr_V[i].VtoString());
        }
        for(int i=0;i<data1.total_num_of_v-1;i++)
        {
            System.out.println(data1.arr_V[i].EdgetoString());
        }

    }
}
