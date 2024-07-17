import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
// TODO
public class StudentIMS extends StudentInfo  {
    StudentIMS() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        StudentInfo obj = new StudentInfo();
        obj.getStudent();
    }
}

class StudentInfo {
    String name, rollNo;
    int semesters;

    int [] theoryCounts = new int[semesters];
    int [] practicalCounts = new int[semesters];
    int[][] marks = new int[semesters][];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new java.io.FileWriter("C:/Users/Admin/Desktop/result.txt"));

    StudentInfo() throws IOException {
    }


    void getStudent() throws IOException {
        String[] details = br.readLine().split(" ");
        name = details[0];
        rollNo = details[1];
    }

    void getSemesters() throws IOException {
        semesters = Integer.parseInt(br.readLine());
    }

    int getCount(int semester) throws IOException {
        String[] courseTypeCount = br.readLine().split(" ");
        theoryCounts[semester] = Integer.parseInt(courseTypeCount[0]);
        practicalCounts[semester] = Integer.parseInt(courseTypeCount[1]);
        return theoryCounts[semester] + practicalCounts[semester];
    }

    void getMarks() throws IOException {
        for (int i = 0; i < semesters; i++) {
            int count = getCount(i+1);
            marks[i] = new int[count];
            String[] marksString = br.readLine().split(" ");
            for (int j = 0; j < count; j++) {
                marks[i][j] = Integer.parseInt(marksString[j]);
            }
        }
    }

    void calculatePercentages() {

    }





}