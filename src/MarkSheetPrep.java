interface Sport {
    double sport = 2.0;
    default void sportWeightage() {
        System.out.println("\tSport weightage: " + sport);
    }
}
public class MarkSheetPrep {
    public static void main(String[] args) {
        Result s = new Result();
        s.getDetails();
        s.getMarks();
        s.writeResult();
    }
}
class Student {
    int rollNo;
    String name;
    java.util.Scanner sc = new java.util.Scanner(System.in);
    void getDetails() {
        System.out.print("Enter roll no: ");
        rollNo = sc.nextInt();
        System.out.print("Enter name: ");
        name = sc.next();
    }
    void displayDetails() {
        System.out.println("\tRoll no: " + rollNo);
        System.out.println("\tName: " + name);
    }
}
class Test extends Student {
    double CIA1, CIA2, AS1, AS2;
    void getMarks() {
        System.out.print("Enter CIA1: ");
        CIA1 = sc.nextDouble();
        System.out.print("Enter CIA2: ");
        CIA2 = sc.nextDouble();
        System.out.print("Enter AS1: ");
        AS1 = sc.nextDouble();
        System.out.print("Enter AS2: ");
        AS2 = sc.nextDouble();
        if (CIA1 < 0 || CIA1 > 75 || CIA2 < 0 || CIA2 > 75 || AS1 < 0 || AS1 > 10 || AS2 < 0 || AS2 > 10) {
            System.out.println("\033[0;31m*** Invalid marks ***");
            System.exit(0);
        }
    }
    void displayMarks() {
        System.out.println("\tCIA1: " + CIA1);
        System.out.println("\tCIA2: " + CIA2);
        System.out.println("\tAS1: " + AS1);
        System.out.println("\tAS2: " + AS2);
    }
}
class Result extends Test implements Sport {
    double total;
    void displayResult() {
        displayDetails();
        total = (CIA1 + CIA2) / 10 + (AS1 + AS2) / 2.5 + sport;
        System.out.println("\tAcademic result: ");
        displayMarks();
        sportWeightage();
        System.out.print("\tTotal: " + total + " out of 25.0 ");
        System.out.print((total >= 10 ? "\033[0;32m"+"PASS" : "\033[0;31m"+"FAIL") + "\033[0m");
    }
    void writeResult() {
        displayResult();
        try {
            java.io.FileWriter fw = new java.io.FileWriter("C:/Users/Admin/Desktop/result.txt", true);
            fw.write(rollNo + "," + name + "," + total + "\n");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}