package dangphuoctan_5054_employee;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Emp_PartTime extends Employee{
    private int numberOfWDays;

    public Emp_PartTime() {
    }

    public Emp_PartTime(int numberOfWDays, String EmpID, String EmpName, Date EmpDateBirth, Date StartDate) {
        super(EmpID, EmpName, EmpDateBirth, StartDate);
        this.numberOfWDays = numberOfWDays;
    }

    public int getNumberOfWDays() {
        return numberOfWDays;
    }

    public void setNumberOfWDays(int numberOfWDays) {
        this.numberOfWDays = numberOfWDays;
    }
    
    
    @Override
    public double calculateAllowance() {
        long seniority = calculateSeniority();
        if (seniority >= 10) {
            return 500000;
        } else if (seniority < 10) {
            return 300000;
        }
        return 0;
    }

    @Override
    public double calculateSalary() {
        return BASIC_SALARY * getNumberOfWDays()/26 + calculateAllowance();
    }

    @Override
    public void inPut() {
        try {
            System.out.println("_____ Parttime_____");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Emp's ID: ");
            String id = scanner.nextLine();
            setEmpID(id);
            System.out.print("Enter Emp's Name: ");
            String name = scanner.nextLine();
            setEmpName(name);
            System.out.print("Enter Emp's DateOfBirth(dd/MM/yyyy): ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String birth = scanner.nextLine();
            Date date = sdf.parse(birth);
            setEmpDateBirth(date);
            System.out.print("Enter Emp's StartDate(dd/MM/yyyy): ");
            String start = scanner.nextLine();
            Date d = sdf.parse(start);
            setStartDate(d);
            System.out.print("Enter number of workdays: ");
            int number = scanner.nextInt();
            setNumberOfWDays(number);
            
        } catch (Exception E) {
            System.out.println("Enter error!");
        }
    }

    @Override
    public void outPut() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Emp's ID: " + getEmpID());
        System.out.println("Emp's Name: " + getEmpName());
        System.out.println("Emp's Date Of Birth: : " + sdf.format(getEmpDateBirth()));
        System.out.println("Emp's Start Date: " + sdf.format(getStartDate()));
        System.out.println("Emp's number of workdays: " + getNumberOfWDays());
        System.out.println("Calculate Salary:" + calculateSalary());
    }
  
}
