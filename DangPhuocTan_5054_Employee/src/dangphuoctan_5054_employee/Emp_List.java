package dangphuoctan_5054_employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Emp_List {
    private ArrayList<Employee> employeelist = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Emp_List() {
    }
    
    void addEmpFull(Emp_FullTime emp){
        employeelist.add(emp);
    }
    void addEmpPart(Emp_PartTime emp){
        employeelist.add(emp);
    }
    
    
    void updateById(String id){
        for(Employee emp : employeelist){
            if(emp.getEmpID().equals(id)){
               emp.inPut();
            }
            else{
                System.out.println("Not found!");
            }
        }
    }
    
    void deleteById(String id){
        employeelist.removeIf(Employee -> Employee.getEmpID().equals(id));
    } 
    
    void findById(String id){
        for(Employee emp : employeelist){
            if(emp.getEmpID().equals(id)){
                emp.outPut();
            }
        }
    }
    void displayAll(){
        for(Employee emp : employeelist){
            emp.outPut();
        }
    }

}
