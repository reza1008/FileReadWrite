import java.io.*;
import java.util.Scanner;

public class ScannerReadFile {
    public static void main(String[] args) throws IOException {
        //
        // Create an instance of File for data.txt file.
        //
        FileReader file = new FileReader("testfile.txt");
        FileWriter writer = new FileWriter("output.txt");

        try {
            //
            // Create a new Scanner object which will read the data from the
            // file passed in. To check if there are more line to read from it
            // we check by calling the scanner.hasNextLine() method. We then
            // read line one by one till all line is read.
            //
            Scanner scanner = new Scanner(file);
            int [][]matrix = new int [4][4];
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
                {
                    while (scanner.hasNext()) {
                        Integer line = scanner.nextInt();
                        matrix[i][j]=line;
                        //writer.write(matrix[i][j]);
                        break;
                        //System.out.println(line);
                    }
                }
            }
          //  writer.close();
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
                {
                    System.out.print(matrix[i][j]);
                    int x= matrix[i][j];
                    String st= Integer.toString(x);
                    writer.write(st);
                    writer.append(' ');
                    System.out.print(" ");
                }
                writer.append('\n');
                System.out.print("\n");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}