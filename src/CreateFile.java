import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        String fileName, filePath;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the file name: ");
            fileName = br.readLine();
            System.out.print("Enter the file path: ");
            filePath = br.readLine();

            File file = new File(filePath + fileName + ".txt");
            if(!file.createNewFile()) {
                System.out.println("File already exists.");
            } else System.out.println("New file created successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}