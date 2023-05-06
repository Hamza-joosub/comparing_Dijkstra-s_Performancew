import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String args[]) throws FileNotFoundException
    {
        DataSet data1 = new DataSet(10,20);
        data1.generate();
        String data = "";
        for(int i=0;i<data1.total_num_of_v-1;i++)
        {
            data = data + (data1.arr_V[i].EdgetoString());
        }
        System.out.print(data);
        System.out.println(" ");
        
        try {
            File myObj = new File("Graph2.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          try{
          FileWriter myWriter = new FileWriter("Graph2.txt");
          myWriter.write(data);
          myWriter.close();
          }
            catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
          }
          
    





        }
    }

