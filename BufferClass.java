import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferClass {
    public  static void main(String[]args)
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        try {
            
            String name = "";
            while(!(name.equals("stop")))
            {
                 name = br.readLine();
                System.out.println(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
