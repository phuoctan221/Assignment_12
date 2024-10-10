package dangphuoctan_5054_employee;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Emp_FullTime extends Employee {

    private double coefficentsSalary;

    public double getCoefficentsSalary() {
        return coefficentsSalary;
    }

    public void setCoefficentsSalary(double coefficentsSalary) {
        this.coefficentsSalary = coefficentsSalary;
    }

    public Emp_FullTime(double coefficentsSalary) {
        this.coefficentsSalary = coefficentsSalary;
    }

    public Emp_FullTime() {
    }

    @Override
    public double calculateAllowance() {
    double seniority = calculateSeniority();
        if (seniority >= 10) {
            return 1000000;
        } else if (seniority < 10) {
            return 500000;
        }
        return 0;
    }

    @Override
    public double calculateSalary() {
    return BASIC_SALARY * getCoefficentsSalary() + calculateAllowance();
    }

    
    @Override
    public void inPut() {
        try {
            System.out.println("_____ Fulltime_____");
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
            System.out.print("Enter coefficient Salary: ");
            double coe = scanner.nextDouble();
            setCoefficentsSalary(coe);
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
        System.out.println("Coefficients Salary: " + getCoefficentsSalary());
        System.out.println("Calculate Salary: " + calculateSalary());
    }


}
