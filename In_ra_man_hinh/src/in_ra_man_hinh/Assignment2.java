
package in_ra_man_hinh;

import java.util.Scanner;

public class Assignment2 {

    
    public static void main(String[] args) {
  
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Nhap ten vao: ");
    String ten = keyboard.nextLine();
    System.out.print("Nhap vao tuoi: ");
    int tuoi = keyboard.nextInt();
    keyboard.nextLine();
    System.out.print("Nhap vao nam sinh: ");
    int namsinh = keyboard.nextInt();
    keyboard.nextLine();
    System.out.print("Nhap gioi tinh: ");
    String gioitinh = keyboard.nextLine();
    System.out.print("Nhap vao chuyen nganh: ");
    String chuyennganh = keyboard.nextLine();
    System.out.print("Nhap vao GPA: ");
    float GPA = keyboard.nextFloat();
    keyboard.nextLine();
    System.out.print("Nhap vao que huong: ");
    String quequan = keyboard.nextLine();
    
    
    System.out.println(" ------------------------------------------------");
    System.out.println("Ten: " + ten);
    System.out.println("Gioi tinh: " + gioitinh);
    System.out.println("Tuoi: " + tuoi);
    System.out.println("Nam sinh: " + namsinh);
    System.out.println("Chuyen nganh: " + chuyennganh);
    System.out.println("GPA: " + GPA);
    System.out.println("Que quan: " + quequan);
    
    System.out.println(" ------------------------------------------------");
    System.out.print("Nhap mot gi do: ");
        if (keyboard.hasNext()) {
            String ch = keyboard.next();
            System.out.println("Ky tu vua nhap la mot chuoi. ");
        } else {
            System.out.println("Ky tu vua nhap khong phai la chuoi.");
        }
    keyboard.nextLine();
    
    System.out.println(" ------------------------------------------------");
    System.out.print("Nhap mot ki tu: ");
        if (keyboard.hasNextInt()) {
            int number = keyboard.nextInt();
            System.out.println("Ky tu vua nhap la so nguyen. ");
        } else {
            System.out.println("Ky tu vua nhap khong phai la so nguyen.");
        }
    }
    
}
