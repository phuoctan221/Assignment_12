package practice2_dangphuoctan;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BedRoom extends Room {
    private int bedNumber;

    public BedRoom(int bedNumber, String idR, String levelR, Date checkIn, Date checkOut) {
        super(idR, levelR, checkIn, checkOut);
        this.bedNumber = bedNumber;
    }

    public BedRoom() {}

    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    @Override
    public void inPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Room's id: ");
        setIdR(scanner.nextLine());
        System.out.print("Room's level (A|B|C): ");
        setLevelR(scanner.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Check in (dd/MM/yyyy): ");
            setCheckIn(sdf.parse(scanner.nextLine()));
            System.out.print("Check out (dd/MM/yyyy): ");
            setCheckOut(sdf.parse(scanner.nextLine()));
        } catch (Exception e) {
            System.out.println("Invalid date format!");
        }

        System.out.print("Bed's number: ");
        setBedNumber(scanner.nextInt());
    }

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Room's level (A|B|C): ");
        setLevelR(scanner.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Check in (dd/MM/yyyy): ");
            setCheckIn(sdf.parse(scanner.nextLine()));
            System.out.print("Check out (dd/MM/yyyy): ");
            setCheckOut(sdf.parse(scanner.nextLine()));
        } catch (Exception e) {
            System.out.println("Invalid date format!");
        }

        System.out.print("Bed's number: ");
        setBedNumber(scanner.nextInt());
    }

    @Override
    public void outPut() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Room's ID: " + getIdR());
        System.out.println("Room's level: " + getLevelR());
        System.out.println("Bed's number: " + getBedNumber());
        System.out.println("Check-in date: " + sdf.format(getCheckIn()));
        System.out.println("Check-out date: " + sdf.format(getCheckOut()));
    }
}
