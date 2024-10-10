package dangphuoctan_5054_employee;

import java.util.Scanner;

// Assignment 11
public class Processor {

    public static void main(String[] args) {
        Emp_List emplist = new Emp_List();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("_______ MENU _________\n"
                    + "1.Add new employee Full Time \n"
                    + "2. Add new employee Part Time \n"
                    + "3. Update information of emplyee based on EmpID \n"
                    + "4. Delete an employee based on EmpID\n"
                    + "5. Find an employee based on EmpID\n"
                    + "6. Display All\n"
                    + "Enter your choice: ");
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    Emp_FullTime e = new Emp_FullTime();
                    e.inPut();
                    emplist.addEmpFull(e);
                    break;
                case 2:
                    Emp_PartTime em = new Emp_PartTime();
                    em.inPut();
                    emplist.addEmpPart(em);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Id update: ");
                    String idu = scanner.nextLine();
                    emplist.updateById(idu);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Enter id want delete: ");
                    String id = scanner.nextLine();
                    emplist.updateById(id);
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Enter id want find: ");
                    String idf = scanner.nextLine();
                    emplist.findById(idf);
                    break;
                case 6:
                    emplist.displayAll();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid !");
            }
        }
    }
}
