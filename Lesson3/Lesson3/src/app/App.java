package app;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;


public class App {
    public static void main(String[] args) throws Exception {
        
        File f = new File("test.txt");

        if(f.createNewFile())
        {
            System.out.println("Created new file.");
        }

        if(f.canWrite())
        {
            System.out.println("Can Write to File.");
            WriteDataToFile();
        }

        ReadData();

    }

    public static void WriteDataToFile()
    {
        try{
            FileWriter fw = new FileWriter("test.txt");
            fw.write("10\n35\n47\n95\n245\n2");
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println("Error Occurred");
            e.printStackTrace();
        }
    }
    public static void ReadData()
    {
        try
        {
            File file = new File("test.txt");
            Scanner s = new Scanner(file);

            while(s.hasNextLine())
            {
                String data = s.nextLine();
                System.out.println(data);
            }

            s.close();
        }
        catch(IOException e)
        {
            System.out.println("Error Occurred");
            e.printStackTrace();
        }
    }
}