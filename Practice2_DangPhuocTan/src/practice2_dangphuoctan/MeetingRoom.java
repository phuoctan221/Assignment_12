package practice2_dangphuoctan;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MeetingRoom extends Room {
    private int numberChair;

    public MeetingRoom(int numberChair, String idR, String levelR, Date checkIn, Date checkOut) {
        super(idR, levelR, checkIn, checkOut);
        this.numberChair = numberChair;
    }

    public MeetingRoom() {}

    public int getNumberChair() {
        return numberChair;
    }

    public void setNumberChair(int numberChair) {
        this.numberChair = numberChair;
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

        System.out.print("Chair's number: ");
        setNumberChair(scanner.nextInt());
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

        System.out.print("Chair's number: ");
        setNumberChair(scanner.nextInt());
    }

    @Override
    public void outPut() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Room's ID: " + getIdR());
        System.out.println("Room's level: " + getLevelR());
        System.out.println("Chair's number: " + getNumberChair());
        System.out.println("Check-in date: " + sdf.format(getCheckIn()));
        System.out.println("Check-out date: " + sdf.format(getCheckOut()));
    }
}
