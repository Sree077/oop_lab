import java.io.*;
public class FileReadWrite {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        try{
            BufferedReader read = new BufferedReader(new FileReader(inputFile));
            BufferedWriter write = new BufferedWriter(new FileWriter(outputFile));
            String line;
            while((line=read.readLine()) != null){
                write.write(line);
                write.newLine();
            }
            System.out.println("File reading and writing completed!!!");
            read.close();
            write.close();
        }
        catch (FileNotFoundException e){
            System.err.println("File Not found: "+e.getMessage());
        }
        catch (IOException e){
            System.err.println("Error occured while reading/writing"+e.getMessage());
        }
    }
}
