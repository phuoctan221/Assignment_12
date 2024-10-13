package practice2_dangphuoctan;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        ListRoom list = new ListRoom();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("1. Add new Bed Room");
            System.out.println("2. Add new Meeting Room");
            System.out.println("3. Delete room");
            System.out.println("4. Update room");
            System.out.println("5. Statistics of quantity by room type");
            System.out.println("6. Calculate total room rent of all rooms");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    BedRoom bedRoom = new BedRoom();
                    bedRoom.inPut();
                    list.addBedroom(bedRoom);
                    break;
                case 2:
                    MeetingRoom meetingRoom = new MeetingRoom();
                    meetingRoom.inPut();
                    list.addMeetingRoom(meetingRoom);
                    break;
                case 3:
                    System.out.print("Enter room ID to delete: ");
                    String deleteId = scanner.nextLine();
                    list.deleteRoom(deleteId);
                    break;
                case 4:
                    System.out.print("Enter room ID to update: ");
                    String updateId = scanner.nextLine();
                    list.update(updateId);
                    break;
                case 5:
                    System.out.println("Statistics of quantity by room type:");
                    list.statisticsByRoomType();
                    break;
                case 6:
                    System.out.println("Total: " + list.totalRoom());
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
