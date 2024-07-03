import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class WriteFile {
    public static void main(String[] args) {
        String fileName, filePath;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the file name: ");
            fileName = br.readLine();
            System.out.print("Enter the file path: ");
            filePath = br.readLine();
            try(FileOutputStream fos = new FileOutputStream(filePath + fileName + ".txt")) {
                DataOutputStream dos = new DataOutputStream(fos);
                System.out.print("Enter the file content: ");
                fos.write(br.readLine().getBytes());
                dos.writeBytes("\n");
                dos.writeBytes(java.time.LocalDateTime.now().toString());
                dos.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
