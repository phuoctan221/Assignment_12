package dangphuoctan_5054_employee;

import java.util.Calendar;
import java.util.Date;

public abstract class Employee implements IEmployee {

    private String EmpID;
    private String EmpName;
    private Date EmpDateBirth;
    private Date StartDate;

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public Date getEmpDateBirth() {
        return EmpDateBirth;
    }

    public void setEmpDateBirth(Date EmpDateBirth) {
        this.EmpDateBirth = EmpDateBirth;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public Employee(String EmpID, String EmpName, Date EmpDateBirth, Date StartDate) {
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.EmpDateBirth = EmpDateBirth;
        this.StartDate = StartDate;
    }

    public Employee() {
    }

    @Override
    public abstract double calculateAllowance();

    @Override
    public abstract double calculateSalary();

    public abstract void inPut();

    public abstract void outPut();

     public long calculateSeniority() {
        int curent = 2024;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(StartDate);
        int startdate = calendar.get(calendar.YEAR);
        return curent - startdate;
    }

}
