import java.io.*;
public class ReadFile {
    public static void main(String[] args)
    {
        String fileName, filePath;
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the file name: ");
            fileName = br.readLine();
            System.out.print("Enter the file path: ");
            filePath = br.readLine();
            FileReader fr=new FileReader(filePath + fileName + ".txt");
            br = new BufferedReader(fr);
            StringBuilder sb=new StringBuilder();
            String line;
            while((line=br.readLine())!=null)
            {
                sb.append(line).append("\n");
            }
            fr.close();
            System.out.println("Contents of File: ");
            System.out.println(sb);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}