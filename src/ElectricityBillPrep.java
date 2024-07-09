// Single Inheritance

import java.util.Scanner;
public class ElectricityBillPrep {
    public static void main(String[] args) {
        ElectricityBill e = new ElectricityBill();
        e.getDetails();
        e.calculateBill();
        e.displayBill();
    }
}

class Electricity {
    int customerId;
    int units, cmr, lmr;
    double bill, rate;
    Scanner sc = new Scanner(System.in);

    void getDetails() {
        System.out.print("Enter customer id: ");
        customerId = sc.nextInt();
        System.out.print("Enter current month reading: ");
        cmr = sc.nextInt();
        System.out.print("Enter last month reading: ");
        lmr = sc.nextInt();

        if (cmr < lmr) {
            System.out.println("*** Invalid reading ***");
            System.exit(0);
        }
    }

    void calculateBill() {
        units = cmr - lmr;
        if(units <= 100) {
            rate = 3.50;bill = units * rate;
        }
        else if(units <= 200) {
            rate = 4.00;bill = 350 + (units - 100) * rate;
        }
        else if(units <= 300) {
            rate = 5.00;bill = 750 + (units - 200) * rate;
        }
        else {
            rate = 6.00;bill = 1250 + (units - 300) * rate;
        }
    }
}

class ElectricityBill extends Electricity {
    void displayBill() {
        System.out.println("Customer id: " + customerId);
        System.out.println("Bill: " + bill);
        System.out.println("Units consumed: " + (units));
        sc.close();
    }
}